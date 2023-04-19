package com.baile.grupodebaile.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendMailServiceImpl implements SendMailService{

    @Autowired
    private final JavaMailSender mailSender;

    public SendMailServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public void SendMail(String to, String subject, String inputName, String inputPhone,  String from,  String message) {
       SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        
      
        // simpleMailMessage.getFrom();
       //from: debería ser el correo del usuario
       simpleMailMessage.setFrom(from);
       simpleMailMessage.setTo(to);
       simpleMailMessage.setSubject(subject);

       //message: texto del usuario
       String body = ("Email:  " + from) + "\n" + "\n" + ("Nombre:  " + inputName) + "\n" + "\n" + ("Teléfono:  " + inputPhone) + "\n" + "\n" + ("Consulta o comentario:  " + message);
       simpleMailMessage.setText(body);


       this.mailSender.send(simpleMailMessage);
     

    }

    

    
}
