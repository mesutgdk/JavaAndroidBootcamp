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
}
