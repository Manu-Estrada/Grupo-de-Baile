package com.baile.grupodebaile.models;

public class EmailMessage {

    private String to;

    private String from;

    private String subject;

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
