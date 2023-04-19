package com.baile.grupodebaile.services;


public interface SendMailService {
    void SendMail (String to, String subject,  String inputName,  String inputPhone,  String from,  String message);
 
}
