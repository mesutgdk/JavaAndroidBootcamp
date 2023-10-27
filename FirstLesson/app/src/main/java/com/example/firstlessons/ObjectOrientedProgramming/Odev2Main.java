package com.example.firstlessons.ObjectOrientedProgramming;

public class Odev2Main {
    public static void main(String[] args) {
        Odev2 o2 = new Odev2();

        // km to miles
        double answerOfMiles = o2.question1(10);
        System.out.println("Çevirilen Mil: " + answerOfMiles + " miles");

        //Kenarları verilen diktörgenin alanı
        int areaOfRectangle = o2.question2(4,6);
        System.out.println("Dikdöergenin Alanı: " + areaOfRectangle + " cm^2");

        //Sayının faktöriyeli
        int number = 6;
        int factorial = o2.question3(number);
        System.out.println( number + " Sayısının Faktöriyeli: " + factorial);

        //verilen textte belirtilen harf kaç tane var
        String text = "adnroidDeveloper";
        char wanted_e = 'e';

        int containsE = o2.question4(text,wanted_e);
        System.out.println(text + " contains " + containsE + " times " + wanted_e + " character");

        //KEnar sayılarına göre iç açıların toplamını verme

        int countOfSides = 4;
        int totalAngles = o2.question5(countOfSides);
        System.out.println(countOfSides + " Kenarlı Şeklin İç Açıları Toplamı = " + totalAngles);








    }


}
