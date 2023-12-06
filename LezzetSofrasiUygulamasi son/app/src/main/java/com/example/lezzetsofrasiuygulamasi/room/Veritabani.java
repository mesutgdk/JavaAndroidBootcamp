package com.example.lezzetsofrasiuygulamasi.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;


import com.example.lezzetsofrasiuygulamasi.data.entity.Data;

@Database(entities = {Data.class},version = 1)
public abstract class Veritabani extends RoomDatabase {
    public abstract VeriDao getVeriDao();
}
