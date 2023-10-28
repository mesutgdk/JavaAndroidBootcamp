package com.example.firstlessons.ObjectOrientedProgramming.interfaceUsage;

public class MyClass implements MyInterface {

    @Override
    public void func1() {
        System.out.println("func 1 Çalışıyor Babba");
    }

    @Override
    public String func2() {
        return "Func 2 Çalışıyor Haccı";
    }
}
