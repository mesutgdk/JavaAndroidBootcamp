package com.example.contactapp.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.contactapp.data.entity.Kisiler;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

// listeyi tanımladıktan sonra room package ve interface oluşturuyoruz, @dao ekliyoruz
@Dao
public interface KisilerDao {
    // ilk kurduğun tabandan oku
    @Query("SELECT * FROM kisiler")
    Single<List<Kisiler>> kisilerYukle();

    // veri tabanına ekle
    @Insert
    Completable kaydet(Kisiler kisi);

}
