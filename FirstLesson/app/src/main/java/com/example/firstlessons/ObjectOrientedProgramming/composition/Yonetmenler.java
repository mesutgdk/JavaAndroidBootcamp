package com.example.firstlessons.ObjectOrientedProgramming.composition;

public class Yonetmenler {
    private int yonetmen_id;
    private String yonetmen_adi;

    //init
    public Yonetmenler() {
    }

    public Yonetmenler(int yonetmen_id, String yonetmen_adi) {
        this.yonetmen_id = yonetmen_id;
        this.yonetmen_adi = yonetmen_adi;
    }

    //  Setter and Getter
    public int getYonetmen_id() {
        return yonetmen_id;
    }

    public void setYonetmen_id(int yonetmen_id) {
        this.yonetmen_id = yonetmen_id;
    }

    public String getYonetmen_adi() {
        return yonetmen_adi;
    }

    public void setYonetmen_adi(String yonetmen_adi) {
        this.yonetmen_adi = yonetmen_adi;
    }
}
