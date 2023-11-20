package com.example.contactapp.data.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

//sqlite tanım başlangıcı dependency sonrası 1.adım
@Entity(tableName = "kisiler")
public class Kisiler implements Serializable { // data transferi için
    //sqlite 2.adım, kolondaki verileri eşitleme
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "kisi_id")// burdaki kisi_ad tablodaki isim
    @NonNull
    private int kisi_id;
    @ColumnInfo(name = "kisi_ad")
    @NonNull
    private String kisi_ad;
    @ColumnInfo(name = "kisi_tel")
    @NonNull
    private String kisi_tel;

    private Kisiler(){
    }

    public Kisiler(int kisi_id, @NonNull String kisi_ad, @NonNull String kisi_tel) {
        this.kisi_id = kisi_id;
        this.kisi_ad = kisi_ad;
        this.kisi_tel = kisi_tel;
    }

    public int getKisi_id() {
        return kisi_id;
    }

    public void setKisi_id(int kisi_id) {
        this.kisi_id = kisi_id;
    }

    @NonNull
    public String getKisi_ad() {
        return kisi_ad;
    }

    public void setKisi_ad(@NonNull String kisi_ad) {
        this.kisi_ad = kisi_ad;
    }

    @NonNull
    public String getKisi_tel() {
        return kisi_tel;
    }

    public void setKisi_tel(@NonNull String kisi_tel) {
        this.kisi_tel = kisi_tel;
    }
}
