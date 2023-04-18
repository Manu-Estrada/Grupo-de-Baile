package com.baile.grupodebaile.services;


public interface SendMailService {
    void SendMail (String inputName,  int inputPhone, String to, String from, String subject, String message);
 
}
