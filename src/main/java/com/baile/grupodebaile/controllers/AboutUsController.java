package com.baile.grupodebaile.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.baile.grupodebaile.models.AboutUs;
import com.baile.grupodebaile.services.AboutUsService;


@RestController
@RequestMapping(path = "/api")

public class AboutUsController {

    private AboutUsService service;

    public AboutUsController(AboutUsService service) {
        this.service = service;
    }

    @PostMapping(path = "/aboutus")
    public AboutUs store(@RequestBody AboutUs aboutUs) {
        return service.save(aboutUs);

    }

    @PostMapping("/aboutus/{id}/imagesaboutus")
    public void saveImageAboutUs(@RequestParam("image") MultipartFile multipartFile, @PathVariable Long id)
            throws IOException {
        service.saveImageAboutUs(multipartFile, id);
    }

    @DeleteMapping("/aboutus/{id}/imagesaboutus")
    public void deleteImageAboutUs(@PathVariable Long id) throws IOException {
        service.deleteImageAboutUs(id);
    }

    @GetMapping("/aboutus")
    public List<AboutUs> listAll() {
        return service.listAll();
    }

    @GetMapping("/aboutus/{id}")
    public AboutUs listOne(@PathVariable Long id) {
        return service.listOne(id);
    }

    @DeleteMapping("/aboutus/{id}")
    public void delete(@PathVariable Long id) throws IOException {
        service.deleteImageAboutUs(id);
        service.delete(id);
    }

    @PutMapping("/aboutus/{id}")
    public AboutUs update(@PathVariable Long id, @RequestBody AboutUs aboutUsNew) {
        return service.update(id, aboutUsNew);
    }
}