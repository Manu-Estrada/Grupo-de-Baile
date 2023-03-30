package com.baile.grupodebaile.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMail {
   
    @Autowired
    private JavaMailSender mail;

    @PostMapping("sendMail")    
    public ResponseEntity<?> sendMail()  {
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo("jehisel.rrp@gmail.com");
        email.setFrom("xareudochobre35@gmail.com");
        email.setSubject("Mensaje de prueba 1");
        email.setText("No responder. Esta es una prueba");

        mail.send(email);

        return new ResponseEntity<>(true, HttpStatus.OK);
    }

}
