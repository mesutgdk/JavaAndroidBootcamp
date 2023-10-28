package com.example.firstlessons.ObjectOrientedProgramming;

//Encapsullation
public class PersonsMain {
    public static void main(String[] args) {
        Persons person = new Persons();

        // Atama
      //  person.name = "Ahmet";
        person.setName("Mesut");

        // Erisim
        //System.out.println(person.name);
        System.out.println(person.getName());
    }
}
