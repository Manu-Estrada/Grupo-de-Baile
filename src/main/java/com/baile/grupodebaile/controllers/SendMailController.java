package com.baile.grupodebaile.controllers;

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

    @PostMapping(path = "/sendemail")
    public ResponseEntity<?> sendMail(@RequestBody EmailMessage emailMessage) {
        this.sendMailService.SendMail(emailMessage.getInputName(), emailMessage.getInputPhone(), emailMessage.getTo(), emailMessage.getFrom(), emailMessage.getSubject(), emailMessage.getMessage());
        return ResponseEntity.ok("Success");
    }

}
