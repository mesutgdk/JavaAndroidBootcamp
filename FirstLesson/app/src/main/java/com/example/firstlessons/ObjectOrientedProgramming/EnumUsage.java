package com.example.firstlessons.ObjectOrientedProgramming;

public class EnumUsage { // static func kullacaksanız içindeki func da static olmalı
    public static void main(String[] args) {
        priceCalculate(KonserveBoyut.Middle,100);

    }

    public static void priceCalculate(KonserveBoyut boyut, int adet){
        switch (boyut){
            case Little:
                System.out.println("ücret: "+(adet*24)+" $");
                break;
            case Middle:
                System.out.println("ücret: "+(adet*37)+" $");
                break;
            case Large:
                System.out.println("ücret: "+(adet*66)+" $");
                break;
        }
    }
}
