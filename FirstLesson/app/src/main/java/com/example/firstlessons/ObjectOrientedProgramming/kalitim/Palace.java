package com.example.firstlessons.ObjectOrientedProgramming.kalitim;

public class Palace extends House {
    private int towerNumber;

    //init
    public Palace() {
    }

    public Palace(int towerNumber) {
        this.towerNumber = towerNumber;
    }
    // Getter And Setter
    public int getTowerNumber() {
        return towerNumber;
    }

    public void setTowerNumber(int towerNumber) {
        this.towerNumber = towerNumber;
    }
}
