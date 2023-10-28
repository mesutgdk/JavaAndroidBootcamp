package com.example.firstlessons.ObjectOrientedProgramming.composition;

public class Filmler {
    private int film_id;
    private String film_adi;
    private int film_yil;

    private Katagoriler katagori; // Composition
    private Yonetmenler yonetmen; // Composition

    //init
    public Filmler() {
    }

    public Filmler(int film_id, String film_adi, int film_yil, Katagoriler katagori, Yonetmenler yonetmen) {
        this.film_id = film_id;
        this.film_adi = film_adi;
        this.film_yil = film_yil;
        this.katagori = katagori;
        this.yonetmen = yonetmen;
    }

    // Getter and Setter
    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getFilm_adi() {
        return film_adi;
    }

    public void setFilm_adi(String film_adi) {
        this.film_adi = film_adi;
    }

    public int getFilm_yil() {
        return film_yil;
    }

    public void setFilm_yil(int film_yil) {
        this.film_yil = film_yil;
    }

    public Katagoriler getKatagori() {
        return katagori;
    }

    public void setKatagori(Katagoriler katagori) {
        this.katagori = katagori;
    }

    public Yonetmenler getYonetmen() {
        return yonetmen;
    }

    public void setYonetmen(Yonetmenler yonetmen) {
        this.yonetmen = yonetmen;
    }
}
