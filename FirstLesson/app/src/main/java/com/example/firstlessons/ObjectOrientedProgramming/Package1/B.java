package com.example.firstlessons.ObjectOrientedProgramming.Package1;

import com.example.firstlessons.ObjectOrientedProgramming.Package1.A; // * yapılırsa hepsini dahil eder

public class B {
    public void metod() {
        A a = new A();
        System.out.println(a.publicValue);
        System.out.println(a.defaultValue);
        System.out.println(a.protectedValue);

    }


}
