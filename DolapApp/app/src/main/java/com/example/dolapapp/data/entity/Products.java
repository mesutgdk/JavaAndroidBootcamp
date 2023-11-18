package com.example.dolapapp.data.entity;

import java.io.Serializable;

public class Products implements Serializable {
    private int id;
    private String name;
    private String photo;
    private String size;
    private String title;
    private int favoridNumber;
    private int price;

    public Products() {
    }

    public Products(int id, String name, String photo, String size, String title, int favoridNumber, int price) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.size = size;
        this.title = title;
        this.favoridNumber = favoridNumber;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getFavoridNumber() {
        return favoridNumber;
    }

    public void setFavoridNumber(int favoridNumber) {
        this.favoridNumber = favoridNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
