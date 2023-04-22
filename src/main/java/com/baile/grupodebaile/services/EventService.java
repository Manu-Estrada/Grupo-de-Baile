package com.baile.grupodebaile.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.baile.grupodebaile.models.Event;
import com.baile.grupodebaile.models.ImageEvent;
import com.baile.grupodebaile.repositories.EventRepository;
import com.baile.grupodebaile.repositories.ImageEventRepository;
import com.baile.grupodebaile.utils.FileUploadUtil;
import com.baile.grupodebaile.utils.RouteFileUploadImage;

@Service
public class EventService {
    private EventRepository repository;

    @Autowired
    private ImageEventRepository imageEventRepository;

    public EventService(EventRepository repository) {
        this.repository = repository;
    }

    public ResponseEntity<Object> saveImageEvent(MultipartFile multipartFile, Long id) throws IOException {
        ImageEvent imageExist = listOneImage(id);
        if (imageExist != null) {
            deleteImageEvent(id);
        }

        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        ImageEvent fileNameExist = imageEventRepository.findByImage(fileName);

        if (fileNameExist != null) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }

        String uploadDir = RouteFileUploadImage.pathToSaveImage("imageEvent");
        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);

        ImageEvent imageEventNew = new ImageEvent();
        imageEventNew.setImage(fileName);
        imageEventRepository.save(imageEventNew);

        Event eventToAddImage = repository.findById(id).orElseThrow();
        eventToAddImage.setImageevent(imageEventNew);
        repository.save(eventToAddImage);

        return new ResponseEntity<>(HttpStatus.OK);

    }

    public Event save(Event eventNew) {
       return  repository.save(eventNew);
    }

    public List<Event> listAll() {
        return repository.findAllByOrderByDateeventAsc();
    }

    public Event listOne(Long id) {
        return repository.findById(id).orElseThrow(null);
    }

    public void delete(Long id) throws IOException {
        ImageEvent imageExist = listOneImage(id);
        if (imageExist != null) {
            deleteImageEvent(id);
        }
        repository.deleteById(id);
    }

    public Event update(Long id, Event eventNew) {
        Event eventToUpdate = eventNew;
        eventToUpdate.setId(id);
        return repository.save(eventToUpdate);
    }

    public void deleteImageEvent(Long idaboutus) throws IOException {
        Event aboutUsToDeleteImage = repository.findById(idaboutus).orElseThrow(null);
        ImageEvent imageToDelete = aboutUsToDeleteImage.getImageevent();
        aboutUsToDeleteImage.setImageevent(null);
        imageEventRepository.delete(imageToDelete);
        String uploadDir = RouteFileUploadImage.pathToSaveImage("imageEvent");
        Path fileToDeletePath = Paths.get(uploadDir + imageToDelete.getImage());
        Files.delete(fileToDeletePath);
    }

    public ImageEvent listOneImage(Long id) {
        Event eventImage = repository.findById(id).orElseThrow(null);
        ImageEvent imageEvent = eventImage.getImageevent();
        if (imageEvent == null) {
            return null;
        }
        Long idImage = imageEvent.getId();
        return imageEventRepository.findById(idImage).orElseThrow(null);
    }
}
