package com.example.todolist.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {})
public abstract class Veritabani extends RoomDatabase {

    public abstract ToDoDao getToDoDao();



}
