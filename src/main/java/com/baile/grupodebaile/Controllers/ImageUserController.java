package com.baile.grupodebaile.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import com.baile.grupodebaile.repositories.ImageUserRepository;
import com.baile.grupodebaile.utils.FileUploadUtil;

import antlr.debug.Event;

@Controller
public class ImageUserController {

    @Autowired
    private ImageUserRepository repository;

    @PostMapping("/users/save")
    public RedirectView saveUser(Event event, @RequestParam("image") MultipartFile multipartFile) throws IOException {

        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        event.setPhoto(fileName);

        String uploadDir = "src/main/resources/user-photos/";

        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);

        return new RedirectView("/users", true);
    }
}

