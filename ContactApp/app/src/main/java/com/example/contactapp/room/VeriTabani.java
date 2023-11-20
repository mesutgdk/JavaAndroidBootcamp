package com.example.contactapp.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.contactapp.data.entity.Kisiler;

@Database(entities = {Kisiler.class},version = 1)
public abstract class VeriTabani extends RoomDatabase {
    public abstract KisilerDao getKisilerDao();
}
