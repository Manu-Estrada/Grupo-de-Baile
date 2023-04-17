package com.baile.grupodebaile.services;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.baile.grupodebaile.models.AboutUs;
import com.baile.grupodebaile.models.ImageAboutUs;
import com.baile.grupodebaile.repositories.AboutUsRepository;
import com.baile.grupodebaile.repositories.ImageAboutUsRepository;
import com.baile.grupodebaile.utils.FileUploadUtil;
import com.baile.grupodebaile.utils.RouteFileUploadImage;

@Service
public class AboutUsService {
    private AboutUsRepository repository;

    @Autowired
    private ImageAboutUsRepository imageAboutUsRepository;

    public AboutUsService(AboutUsRepository repository) {
        this.repository = repository;
    }

    public void saveImageAboutUs(MultipartFile multipartFile, Long id) throws IOException {
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        String uploadDir = RouteFileUploadImage.pathToSaveImage("imageaboutus");
        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);

        ImageAboutUs imageAboutUsNew = new ImageAboutUs();
        imageAboutUsNew.setImage(fileName);
        imageAboutUsRepository.save(imageAboutUsNew);

   AboutUs aboutUsToAddImage = repository.findById(id).orElseThrow();
        aboutUsToAddImage.setImageAboutUs(imageAboutUsNew);
        repository.save(aboutUsToAddImage);
    }

    public void save(AboutUs aboutUsNew) {
        repository.save(aboutUsNew);
    }

    public List<AboutUs> listAll() {
        return repository.findAll();
    }

    public AboutUs listOne(Long id) {
        return repository.findById(id).orElseThrow(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public AboutUs update(Long id, AboutUs aboutUsNew) {
        AboutUs aboutUsToUpdate = aboutUsNew;
        aboutUsToUpdate.setId(id);
        return repository.save(aboutUsToUpdate);
    }


}
