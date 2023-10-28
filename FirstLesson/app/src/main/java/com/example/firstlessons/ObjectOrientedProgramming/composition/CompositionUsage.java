package com.example.firstlessons.ObjectOrientedProgramming.composition;

public class CompositionUsage {
    public static void main(String[] args) {
        Katagoriler k1 = new Katagoriler(1,"Dram");
        Katagoriler k2 = new Katagoriler(2,"Komedi");

        Yonetmenler y1 = new Yonetmenler(1,"Quentin Tarantino");
        Yonetmenler y2 = new Yonetmenler(2,"Christopher Nolan");

        Filmler f1 = new Filmler(1,"Django-Unchained",2013,k1,y1);


        System.out.println("Film id : "+f1.getFilm_id());
        System.out.println("Film adı : "+f1.getFilm_adi());
        System.out.println("Film yılı : "+f1.getFilm_yil());
        System.out.println("Film kategori adı: "+f1.getKatagori().getKategory_ad());
        System.out.println("Film yönetmen adı: "+f1.getYonetmen().getYonetmen_adi());


    }
}
