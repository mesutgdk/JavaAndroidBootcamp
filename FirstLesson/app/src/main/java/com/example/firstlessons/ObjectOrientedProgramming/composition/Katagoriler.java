package com.example.firstlessons.ObjectOrientedProgramming.composition;

public class Katagoriler {
    private int kategory_id;
    private String kategory_ad;

    // init
    public Katagoriler() {
    }

    public Katagoriler(int kategory_id, String kategory_ad) {
        this.kategory_id = kategory_id;
        this.kategory_ad = kategory_ad;
    }

    //  Setter and Getter
    public int getKategory_id() {
        return kategory_id;
    }

    public void setKategory_id(int kategory_id) {
        this.kategory_id = kategory_id;
    }

    public String getKategory_ad() {
        return kategory_ad;
    }

    public void setKategory_ad(String kategory_ad) {
        this.kategory_ad = kategory_ad;
    }
}
