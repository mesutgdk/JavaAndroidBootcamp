package com.example.firstlessons.ObjectOrientedProgramming.overrideUsage;

public class OverrideUsage {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Mammal mammal = new Mammal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        animal.makeNoise(); // KAlıtım yok, kendi metoduna erişti
        mammal.makeNoise(); // KAlıtım var , üst sınıfın metoduna erişti
        cat.makeNoise(); // KAlıtım var , kendi metoduna erişti
        dog.makeNoise(); // KAlıtım var , kendi metoduna erişti

    }
}
