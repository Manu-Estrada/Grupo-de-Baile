package com.baile.grupodebaile.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emails")
public class EmailMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_email")
    private Long id;
    @Column(name = "to")
    private String to;
    @Column(name = "from")
    private String from;
    @Column(name = "subject")
    private String subject;
    @Column(name = "message")
    private String message;
    
    
    public EmailMessage() {
    }

    public EmailMessage(String to, String from, String subject, String message) {
        this.to = to;
        this.from = from;
        this.subject = subject;
        this.message = message;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
   

    
}
