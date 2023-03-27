package com.baile.grupodebaile.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMail {
   
    @Autowired
    private JavaMailSender mail;

    public ResponseEntity<?> sendMail()  {
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo("xareudochobre35@gmail.com");
    }

}
