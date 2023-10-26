package com.example.firstlessons.ObjectOrientedProgramming;

public class Odev2 {
    // Km to Miles
    public double question1(double km){
        double miles = km * 0.621;
        return  miles;
    }
    // lateral to area, kenar uzunluğundan alana
    public int question2(int lateral1, int lateral2){
        int area = lateral1*lateral2;
        return  area;
    }
    public int question3(int num) {
        if (num < 0) {
            System.out.println("Negatif sayının faktoriyeli olmaz");
            return -1; //
        } else if (num == 0 || num == 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = 2; i <= num; i++) {
                result *= i;
            }
            return result;
        }
    }
}
