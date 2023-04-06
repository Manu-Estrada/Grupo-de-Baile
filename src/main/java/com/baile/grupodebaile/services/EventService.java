package com.baile.grupodebaile.services;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

    public void saveImageEvent(MultipartFile multipartFile, Long id) throws IOException {
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        String uploadDir = RouteFileUploadImage.pathToSaveImage("imageEvent");
        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);

        ImageEvent imageEventNew = new ImageEvent();
        imageEventNew.setImage(fileName);
        imageEventRepository.save(imageEventNew);

        Event eventToAddImage = repository.findById(id).orElseThrow();
        eventToAddImage.setImageevent(imageEventNew);
        repository.save(eventToAddImage);
    }

    public void save(Event eventNew) {
        repository.save(eventNew);
    }

    public List<Event> listAll() {
        return repository.findAll();
    }

    public Event listOne(Long id) {
        return repository.findById(id).orElseThrow(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Event update(Long id, Event eventNew) {
        Event eventToUpdate = eventNew;
        eventToUpdate.setId(id);
        return repository.save(eventToUpdate);
    }


}
