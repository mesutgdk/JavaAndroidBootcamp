package com.example.firstlessons.ObjectOrientedProgramming;

public class Persons {
    private String name;

    public String getName() {// Erişim
        return name;
    }

    public void setName(String name) { // Atama
        this.name = name;//shadowing
    }
}
