package com.example.firstlessons.ObjectOrientedProgramming;

// public static final int x = 10; final yazarsanız değişimi engellemiş olursunuz
public class StaticUsage {
    public static void main(String[] args) {
        AClass a = new AClass();

        System.out.println(a.x); // tek nesne oluşturduk
        a.func();

        // Sanal Nesne, isimsiz nesne(Vietul or nameless object)
        System.out.println(new AClass().x); // new AClass() = a demek  ve 1.nesne oluşturduk
        new AClass().func(); // 2.nesne oluşturduk, hafıza işgal eder.

        System.out.println(AClass.y);
        AClass.func2();
    }
}
