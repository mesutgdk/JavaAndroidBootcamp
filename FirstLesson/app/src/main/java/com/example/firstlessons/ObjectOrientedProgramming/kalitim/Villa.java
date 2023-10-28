package com.example.firstlessons.ObjectOrientedProgramming.kalitim;

public class Villa extends House{
    private boolean hasGarage;

    //init
    public Villa() {
    }

    public Villa(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    // Getter And Setter
    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }
}
