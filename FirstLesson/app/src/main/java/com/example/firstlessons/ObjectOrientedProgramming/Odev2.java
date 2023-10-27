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
 // Stringde kaç tane belirtilen harften var
    public int question4(String input, char target) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    //Kenar sayılarına göre iç açıların toplamını verme
    public  int question5(int sides){
        int totalAngles = ((sides - 2)*180);
        return  totalAngles;
    }

    // çalışılan gün sayısına göre ücret hesabı
    public int question6(int days){
        int hoursForADay = 8;
        int regularRate = 40;
        int overtimeRate = 80;
        int endOfRegularRate = 150;

        int totalWorkHour = hoursForADay*days;
        int regularWage = 0;
        int overtimeWage = 0;

        if (totalWorkHour <= 150){
            regularWage = totalWorkHour * regularRate;
        } else {
            regularWage = endOfRegularRate * regularRate;
        }
    }
}
