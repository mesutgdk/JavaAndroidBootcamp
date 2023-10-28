package com.example.firstlessons.ObjectOrientedProgramming.kalitim;

public class House {
    private int windowNumbers;

    //init
    public House() {
    }

    public House(int windowNumbers) {
        this.windowNumbers = windowNumbers;
    }

    //Getter Setter
    public int getWindowNumbers() {
        return windowNumbers;
    }

    public void setWindowNumbers(int windowNumbers) {
        this.windowNumbers = windowNumbers;
    }
}
