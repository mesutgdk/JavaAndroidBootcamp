package com.example.firstlessons.ObjectOrientedProgramming;

public class Odev2Main {
    public static void main(String[] args) {
        Odev2 o2 = new Odev2();

        double answerOfMiles = o2.question1(10);
        System.out.println("Çevirilen Mil: " + answerOfMiles + " miles");

        int areaOfRectangle = o2.question2(4,6);
        System.out.println("Dikdöergenin Alanı: " + areaOfRectangle + " cm^2");

        int factorial = o2.question3(6);
        System.out.println("Girilen Sayının Faktöriyeli: " + factorial);


    }


}
