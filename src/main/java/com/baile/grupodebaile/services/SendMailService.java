package com.baile.grupodebaile.services;


public interface SendMailService {
    void SendMail (String inputName,  String inputPhone, String to, String from, String subject, String message);
 
}
