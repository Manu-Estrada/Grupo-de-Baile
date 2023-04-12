package com.baile.grupodebaile.services;


public interface SendMailService {
    void SendMail (String to, String from, String subject, String message);
 
}
