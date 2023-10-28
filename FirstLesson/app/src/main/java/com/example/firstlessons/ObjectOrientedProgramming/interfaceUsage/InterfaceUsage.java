package com.example.firstlessons.ObjectOrientedProgramming.interfaceUsage;

public class InterfaceUsage {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();

        myClass.func1();
        String resultFromFunc2 = myClass.func2();
        System.out.println(resultFromFunc2);
    }
}
