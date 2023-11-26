package com.example.todolist.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.todolist.data.repo.ToDoo;

@Database(entities = {ToDoo.class}, version = 1)
public abstract class Veritabani extends RoomDatabase {

    public abstract DosDao getToDoDao();
}
