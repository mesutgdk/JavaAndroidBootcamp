package com.example.firstlessons.standart_programlama;

import android.widget.Switch;

public class IfAndSwitchUsage {
    public static void main(String[] args){
        int age = 17;
        String name = "Mehmet";

        if(age >= 18){
            System.out.println("Reşitsiniz");
        } else {
            System.out.println("Reşit Değilsiniz");
        }
        if (name == "Ahmet"){  // ==: name.equal("Ahmet") eski java
            System.out.println("Merhaba Ahmet");
        } else if( name == "Mehmet"){
            System.out.println("Merhaba Mehmet");
        }else{
            System.out.println("Tanınmayan Kişi");
        }


        String userName = "admin";
        int password = 123456;

        if (userName == "admin" && password == 123456){
            System.out.println("Hoşgeldin Hacı");
        }else {
            System.out.println("Hatalı Giriş");
        }

        int number = 11;

        if (number == 11 || number == 9){
            System.out.println("Sayı 9 veya 11'dir");
        }else {
            System.out.println("Sayı 9 veya 11 değildir.");
        }

        // Switch == When(Kotlin)

        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a Correct day");
                break;

        }
    }
}
