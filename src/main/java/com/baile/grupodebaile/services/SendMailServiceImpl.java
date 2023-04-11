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
    public void SendMail(String to, String from, String subject, String message) {
       SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

       //from: debería ser el correo del usuario
       simpleMailMessage.setFrom(" mail@example");
       //to: El correo al que va a llegar la información, que será del admin de Xaréu (David)
       simpleMailMessage.setTo(to);
       //subject: input asunto 
       simpleMailMessage.setSubject(subject);
       //message: texto del usuario
       simpleMailMessage.setText(message);

       this.mailSender.send(simpleMailMessage);
     

    }

    

    
}
