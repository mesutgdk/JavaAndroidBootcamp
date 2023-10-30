package com.example.firstlessons.collections;

import java.util.HashSet;

public class HashSetUsage {
    public static void main(String[] args) {
        HashSet<String> meyveler = new HashSet<>();

        // Veri Ekleme
        meyveler.add("Muz");
        meyveler.add("Portakal");
        meyveler.add("Elma");

        System.out.println(meyveler);

        meyveler.add("Elma");

        System.out.println(meyveler);

        meyveler.add("Amasya Elma");

        System.out.println(meyveler);

        System.out.println("Boyut: "+meyveler.size());

        for (String m:meyveler){
            System.out.println("Sonuç: "+m);
        }

        boolean muzVarMi = meyveler.contains("Muz");
        System.out.println(muzVarMi);

        meyveler.remove("Muz");
        System.out.println(meyveler);

        meyveler.clear();
        System.out.println(meyveler);


    }
}
