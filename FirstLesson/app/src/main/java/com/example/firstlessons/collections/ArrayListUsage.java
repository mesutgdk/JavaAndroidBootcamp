package com.example.firstlessons.collections;

import java.util.ArrayList;

public class ArrayListUsage {
    public static void main(String[] args) {
        ArrayList<String> meyveler = new ArrayList<>();

        // Veri Ekleme
        meyveler.add("Muz");
        meyveler.add("Armut");
        meyveler.add("Kiraz");

        System.out.println(meyveler);

        // Güncelleme
        meyveler.set(1,"Yeni Ayva");

        System.out.println(meyveler);

        // Insert(Dahil etmek)
        meyveler.add(1,"Portakal");

        System.out.println(meyveler);

        // içinden seçme meyveler[2]
        String meyve = meyveler.get(2);

        System.out.println(meyve);

        // meyveler.count
        System.out.println("Boyut : "+meyveler.size());

        //for each
        for (String m: meyveler){
            System.out.println("Sonuç: "+m);
        }

        // 0,1,2,3,
        for (int i=0;i<meyveler.size();i++) {
            System.out.println(i + ". ->" + meyveler.get(i));
        }

        //remove, indexten çıkarma
        meyveler.remove(2);
        System.out.println(meyveler);

        //clean
        meyveler.clear();
        System.out.println(meyveler);

    }
}
