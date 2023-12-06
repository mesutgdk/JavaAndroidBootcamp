package com.example.lezzetsofrasi.retrofit;

import com.example.lezzetsofrasi.data.entity.YemeklerCevap;

import retrofit2.Call;
import retrofit2.http.GET;

public interface YemeklerDao {
    // http://kasimadalan.pe.hu/yemekler/tumYemekleriGetir.php
    // http://kasimadalan.pe.hu/ base url
    // tumYemekleriGetir.php


    @GET("yemekler/tumYemekleriGetir.php")
    Call<YemeklerCevap> yemekleriYukle();
}
