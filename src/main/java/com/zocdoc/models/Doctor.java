package com.zocdoc.models;

import java.io.Serializable;

/**
 * Created by Khrupalyk on 9/28/15.
 */
public class Doctor implements Serializable {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
