package com.example.day4_homework2.entities.concretes;

import com.example.day4_homework2.entities.abstracts.Entity;

import java.util.ArrayList;
import java.util.List;

public class User implements Entity {
    private int id;
    private String nationalId;
    private String firstName;
    private String lastName;
    private String yearOfBirth;
    private List<Game> gamesOfUser = new ArrayList<>();

    public User(int id, String nationalId, String firstName, String lastName, String yearOfBirth) {
        this.id = id;
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public List<Game> getGamesOfUser() {
        return gamesOfUser;
    }

    public void setGamesOfUser(List<Game> gamesOfUser) {
        this.gamesOfUser = gamesOfUser;
    }
}
