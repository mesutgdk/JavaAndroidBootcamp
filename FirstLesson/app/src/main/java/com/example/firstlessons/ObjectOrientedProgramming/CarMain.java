package com.example.firstlessons.ObjectOrientedProgramming;

public class CarMain {
    public static void main(String[] args) {
        // nesne oluşturma
        Car bmv = new Car();
        //değer atama
        bmv.color = "Mavi";
        bmv.speed = 120;
        bmv.workin = true;

        System.out.println("----------------");
        System.out.println("Color           :"+bmv.color);
        System.out.println("Speed           :"+bmv.speed);
        System.out.println("Working         :"+bmv.workin);

        Car sahin = new Car();

        sahin.workin = true;
        sahin.color = "white";
        sahin.speed = 90;

        // Değer Okuma
        System.out.println("----------------");
        System.out.println("Color           :"+sahin.color);
        System.out.println("Speed           :"+sahin.speed);
        System.out.println("Working         :"+sahin.workin);

        bmv.takeInfo();
        sahin.takeInfo();

        sahin.slowDown(40);


        Car audi = new Car("white", 150,true);
        audi.takeInfo();
    }
}
