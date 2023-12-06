package com.example.lezzetsofrasiuygulamasi.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.lezzetsofrasiuygulamasi.data.entity.Data;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

@Dao
public interface VeriDao {
    @Query("SELECT * FROM Veritabani")
    Single<List<Data>> veriYukle();

    @Insert
    Completable kaydet(Data kisi);

    @Update
    Completable guncelle(Data kisi);

    @Delete
    Completable sil(Data kisi);

    @Query("SELECT * FROM Veritabani WHERE yemek_ad = :yemek_ad")
    Single<List<Data>> idAra(String yemek_ad);
}
