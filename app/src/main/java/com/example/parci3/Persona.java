package com.example.parci3;

import java.io.Serializable;

public class Persona implements Serializable {
    private String txtUser;

    public Persona(String user) {
        this.txtUser = user;
    }

    public String getTxtUser() {
        return txtUser;
    }

}
