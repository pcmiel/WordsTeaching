package com.juri.words.form;
import java.io.Serializable;
/**
 * Created with IntelliJ IDEA.
 * User: cmiel
 * Date: 04.01.14
 * Time: 18:09
 * To change this template use File | Settings | File Templates.
 */
public class RegistrationForm implements Serializable {

    private String name;

    private String email;

    private String username;

    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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