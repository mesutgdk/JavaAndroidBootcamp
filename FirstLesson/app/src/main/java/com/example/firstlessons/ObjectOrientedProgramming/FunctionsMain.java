package com.example.firstlessons.ObjectOrientedProgramming;

public class FunctionsMain {
    public static void main(String[] args) {
        Functions f = new Functions();
        f.salutVoid();

        String comeBack = f.salutReturn2();

        System.out.println("Gelen Sonuç: "+comeBack);

        f.salutParameter("Çiğdem");

        f.multiply(4,5,"Atahan");
    }
}
