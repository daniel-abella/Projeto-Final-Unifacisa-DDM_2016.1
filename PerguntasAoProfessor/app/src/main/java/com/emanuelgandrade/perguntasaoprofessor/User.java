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

    public String getMail() {
        return mail;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
