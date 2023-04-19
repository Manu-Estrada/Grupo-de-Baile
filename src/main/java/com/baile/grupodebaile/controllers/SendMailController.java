package com.baile.grupodebaile.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.baile.grupodebaile.models.EmailMessage;
import com.baile.grupodebaile.services.SendMailService;

@RestController
public class SendMailController {

    private final SendMailService sendMailService;

    public SendMailController(SendMailService sendMailService) {
        this.sendMailService = sendMailService;
    }

    @PostMapping(path = "/api/sendemail")
    public ResponseEntity<?> sendMail(@RequestBody EmailMessage emailMessage) {
        emailMessage.setTo("jehisel.rrp@gmail.com");
        emailMessage.setSubject("Mensaje para Xaréu D´Ochobre");

        this.sendMailService.SendMail(emailMessage.getTo(), emailMessage.getSubject(), emailMessage.getInputName(), emailMessage.getInputPhone(), emailMessage.getFrom(), emailMessage.getMessage());
        return new ResponseEntity<>(HttpStatus.OK);
    }
    

}
