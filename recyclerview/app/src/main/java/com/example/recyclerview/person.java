package com.example.recyclerview;

public class person {
   private String name;
    private String surname;
   private String preferrence;

    public person(String name, String surname, String preferrence) {
        this.name = name;
        this.surname = surname;
        this.preferrence = preferrence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPreferrence() {
        return preferrence;
    }

    public void setPreferrence(String preferrence) {
        this.preferrence = preferrence;
    }
}
