package com.baile.grupodebaile.controllers;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.mail.SimpleMailMessage;
// import org.springframework.mail.javamail.JavaMailSender;
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

    @PostMapping(path = "/send-email")
    public ResponseEntity<?> sendMail(@RequestBody EmailMessage emailMessage)  {
        this.sendMailService.SendMail(emailMessage.getTo(), emailMessage.getSubject(), emailMessage.getMessage());
      return ResponseEntity.ok("Success");
    }

    // @PostMapping("/sendMail")
    // public ResponseEntity<?> sendMail(@RequestBody EmailMessage emailMessage)  {
    //     SimpleMailMessage email = new SimpleMailMessage();
    //     email.setTo("xareudochobre35@gmail.com");
    //     email.setTo("jehisel.rrp@gmail.com");
    //     email.setFrom("xareudochobre35@gmail.com");
    //     email.setSubject("Mensaje de prueba 1");
    //     email.setText("No responder. Esta es una prueba");

    //     mail.send(email);

    //     return new ResponseEntity<>(true, HttpStatus.OK);
    // }

}

