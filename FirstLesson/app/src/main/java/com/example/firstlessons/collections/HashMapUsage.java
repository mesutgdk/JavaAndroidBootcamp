package com.example.firstlessons.collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapUsage {
    public static void main(String[] args) {
        //HashMap : Swift(Dictionary)
        //JSON alt yapısı Hashmap'tir
        //Object: en üst sınıftır, Kotlin(Any), Swift(Any)

        HashMap<Integer,String> iller = new HashMap<>();

        // Veri Ekleme
        iller.put(16, "Bursa");
        iller.put(1,"Adana");
        iller.put(34,"İstanbul");

        System.out.println(iller);

        // Güncelleme
        iller.put(16,"Yeni Bursa");
        System.out.println(iller);

        // okuma
        String il = iller.get(34);
        System.out.println(il);
        System.out.println("Boyut: "+iller.size());

        Set<Integer> keys = iller.keySet();
        for (Integer k:keys){
            System.out.println("Sonuç: "+iller.get(k));
        }

        iller.remove(16);
        System.out.println(iller);

        iller.clear();
        System.out.println(iller);
    }
}
