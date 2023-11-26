package com.example.todolist.room;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import io.reactivex.Single;

@Dao
public interface DosDao {
    @Query("SELECT * FROM jobs")
    Single<List<ToDos>>
}
