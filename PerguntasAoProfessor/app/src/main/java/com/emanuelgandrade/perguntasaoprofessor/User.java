package com.emanuelgandrade.perguntasaoprofessor;

/**
 * Created by emanu on 06/06/2016.
 */
public class User {

    private String name, mail, username, password;

    public User(String name, String mail, String username, String password) {
        this.name = name;
        this.mail = mail;
        this.username = username;
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.name = "";
        this.mail = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
