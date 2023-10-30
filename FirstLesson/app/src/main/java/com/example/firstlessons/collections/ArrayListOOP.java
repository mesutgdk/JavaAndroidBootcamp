package com.example.firstlessons.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListOOP {
    public static void main(String[] args) {
        Products product1 = new Products(1, "Telefon", 23000);
        Products product2 = new Products(2, "PC", 42000);
        Products product3 = new Products(3, "Süpürge", 11000);

        ArrayList<Products> productsList = new ArrayList<>();

        productsList.add(product1);
        productsList.add(product2);
        productsList.add(product3);

        for (Products p:productsList){
            System.out.println("ID: "+p.getId()+" - Name: "+p.getName()+" - Price: "+p.getPrice()+" $");
        }


        //ada göre artan
        Collections.sort(productsList,new Sort1());
        System.out.println("-----Ad Artan-----");

        for (Products p:productsList){
            System.out.println("ID: "+p.getId()+" - Name: "+p.getName()+" - Price: "+p.getPrice()+" $");
        }

        // ada göre azalan
        Collections.sort(productsList,new Sort2());
        System.out.println("-----Ad Azalan-----");

        for (Products p:productsList){
            System.out.println("ID: "+p.getId()+" - Name: "+p.getName()+" - Price: "+p.getPrice()+" $");
        }

        // fiyata göre artan
        Collections.sort(productsList,new Sort3());
        System.out.println("-----Fiyat Artan-----");

        for (Products p:productsList){
            System.out.println("ID: "+p.getId()+" - Name: "+p.getName()+" - Price: "+p.getPrice()+" $");
        }
        // fiyata göre azalan
        Collections.sort(productsList,new Sort4());
        System.out.println("-----Fiyat AZALAN-----");

        for (Products p:productsList){
            System.out.println("ID: "+p.getId()+" - Name: "+p.getName()+" - Price: "+p.getPrice()+" $");
        }
    }

    // ada göre artan
    public static class Sort1 implements Comparator<Products> {
        @Override
        public int compare(Products p1, Products p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }
    // ada göre azalan
    public static class Sort2 implements Comparator<Products> {
        @Override
        public int compare(Products p1, Products p2) {
            return p2.getName().compareTo(p1.getName());
        }
    }
    // sayısal kıyaslama - artan
    public static class Sort3 implements Comparator<Products> {
        @Override
        public int compare(Products p1, Products p2) {
            // int -> Integer  integer'a çevirmen lazım
            return new Integer(p1.getPrice()).compareTo(p2.getPrice());
            // p1.getPrice(). yazdığında fonc çıkmıyor, integera çevirip fonc alabiliyoruz
        }
    }
    public static class Sort4 implements Comparator<Products> {
        @Override
        public int compare(Products p1, Products p2) {
            // int -> Integer  integer'a çevirmen lazım
            return new Integer(p2.getPrice()).compareTo(p1.getPrice());
        }
    }
}
