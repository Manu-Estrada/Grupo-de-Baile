package com.baile.grupodebaile.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "consulting")
public class Consulting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consulting")
    private Long id;
    @Column(name = "input_name")
    private String inputName;
    @Column(name = "input_phone")
    private int inputPhone;
    //el from sería el inputEmail de front formulario contacto
    @Column(name = "email_user")
    private String emailUser;
    //el subject sería el inputSubject en front
    @Column(name = "subject_user")
    private String subjectUser;
    //el message sería el inputMessage en front
    @Column(name = "message_user")
    private String messageUser;
    
    public Consulting() {
    }

    public Consulting(String inputName, int inputPhone, String emailUser, String subjectUser, String messageUser) {
        this.inputName = inputName;
        this.inputPhone = inputPhone;
        this.emailUser = emailUser;
        this.subjectUser = subjectUser;
        this.messageUser = messageUser;
    }

    public Long getId() {
        return id;
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

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getSubjectUser() {
        return subjectUser;
    }

    public void setSubjectUser(String subjectUser) {
        this.subjectUser = subjectUser;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }


    

    
    

   



}
