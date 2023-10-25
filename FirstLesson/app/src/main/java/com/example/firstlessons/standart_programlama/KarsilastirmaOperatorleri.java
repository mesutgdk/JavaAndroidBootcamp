package com.example.firstlessons.standart_programlama;

public class KarsilastirmaOperatorleri {
    public static void main(String[] args) {
        int a = 40;
        int b = 50;

        int x = 90;
        int y = 80;
        System.out.println("a==b: " +(a==b));
        System.out.println("a!=b: " +(a!=b));
        System.out.println("a>b: " +(a>b));
        System.out.println("a>=b: " +(a>=b));
        System.out.println("a<b: " +(a<b));
        System.out.println("a<=b: " +(a<=b));

        System.out.println("a>b || x>y: " +(a>b || x>y));
        // or false : false ise false çıkar diğer durumlarda true çıkar
        System.out.println("a>b && x>y: " +(a>b && x>y));
        // ve true : true ise true çıkar diğer durumlarda false çıkar
    }
}
