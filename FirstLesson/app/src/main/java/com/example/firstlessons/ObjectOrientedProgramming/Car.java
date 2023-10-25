package com.example.firstlessons.ObjectOrientedProgramming;

public class Car {
    String color;
    int speed;
    boolean workin;
    //this = Car, bulunduğu class'ı teslim eder
    // swift self = this
    public void takeInfo(){
        System.out.println("----------------");
        System.out.println("Color           :"+color);
        System.out.println("Speed           :"+speed);
        System.out.println("Working         :"+workin);
    }

    public Car() {// Constructor = init function
        System.out.println("Nesne Oluştu");
    }

    public Car(String color, int speed, boolean workin){
    this.color = color; // shadowing gölgeleme
    this.speed = speed;
    this.workin = workin;
    }

    public void start() {
        workin = true;
        speed = 5;
    }

    public void stop() {
        workin = false;
        speed = 0;
    }

    public void slowDown(int amount) {
        this.speed = speed - amount;
    }

    public void speedUp(int amount) {
        this.speed = speed + amount;
    }
}
