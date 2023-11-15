package com.example.mvvmusage;

import androidx.lifecycle.MutableLiveData;

public class MatematikRepository {
    public MutableLiveData<String> sonuc = new MutableLiveData<>("0");

    public void topla(String alinanSayi1, String alinanSayi2){

        int sayi1 = Integer.parseInt(alinanSayi1);
        int sayi2 = Integer.parseInt(alinanSayi2);
        int toplam = sayi2 + sayi1;

        sonuc.setValue(String.valueOf(toplam));// Tetikleme
    }

    public void carp(String alinanSayi1, String alinanSayi2){

        int sayi1 = Integer.parseInt(alinanSayi1);
        int sayi2 = Integer.parseInt(alinanSayi2);
        int carpma = sayi2 * sayi1;

        sonuc.setValue(String.valueOf(carpma));// Tetikleme
    }
}
