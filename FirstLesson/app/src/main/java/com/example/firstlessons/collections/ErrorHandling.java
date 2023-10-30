package com.example.firstlessons.collections;

public class ErrorHandling {
    public static void main(String[] args) {
        // 1.Compile Error
        final int x = 10;
        //x = 90;  bu compile error

        // 2.Runtime Error(Exception)
        int a = 10;
        int b = 5;
        System.out.println("Sonuç: "+(a/b));
        System.out.println("İşlem Bitti");

        try{
            b = 0;
            System.out.println("Sonuç: "+(a/b));
        }catch (Exception e){
            System.out.println("İkinci Sayı Sıfır olamaz");
        }
    }
}
