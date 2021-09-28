package com.example.fragments.models;

public class User {
    private String name, surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return "@ " + name;
    }

    public String getSurname() {
        return surname;
    }
}
