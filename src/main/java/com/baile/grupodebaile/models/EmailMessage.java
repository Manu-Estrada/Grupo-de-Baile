package com.baile.grupodebaile.models;

public class EmailMessage {

    private String inputName;

    private int inputPhone;

    // el to es el correo del admin de la página (David)
    private String to;

    // el from sería el inputEmail de front formulario contacto
    private String from;

    // el subject sería el inputSubject en front
    private String subject;

    // el message sería el inputMessage en front
    private String message;

    public EmailMessage() {
    }

    public EmailMessage(String inputName, int inputPhone, String to, String from, String subject, String message) {
        this.inputName = inputName;
        this.inputPhone = inputPhone;
        this.to = to;
        this.from = from;
        this.subject = subject;
        this.message = message;
    }

    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    public int getInputPhone() {
        return inputPhone;
    }

    public void setInputPhone(int inputPhone) {
        this.inputPhone = inputPhone;
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
