package com.example.dolapapp.data.entity;

import java.io.Serializable;

public class Products implements Serializable {
    private int id;
    private String title;
    private String photo;
    private String size;
    private String descriptionShort;

    private String descriptionLong;
    private String usage;
    private String brand;
    private String color;
    private int favorited;
    private int price;

    public Products() {
    }

    public Products(int id, String title, String photo, String size, String descriptionShort, String descriptionLong, String usage, String brand, String color, int favorited, int price) {
        this.id = id;
        this.title = title;
        this.photo = photo;
        this.size = size;
        this.descriptionShort = descriptionShort;
        this.descriptionLong = descriptionLong;
        this.usage = usage;
        this.brand = brand;
        this.color = color;
        this.favorited = favorited;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getDescriptionShort() {
        return descriptionShort;
    }

    public void setDescriptionShort(String descriptionShort) {
        this.descriptionShort = descriptionShort;
    }

    public String getDescriptionLong() {
        return descriptionLong;
    }

    public void setDescriptionLong(String descriptionLong) {
        this.descriptionLong = descriptionLong;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFavorited() {
        return favorited;
    }

    public void setFavorited(int favorited) {
        this.favorited = favorited;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
