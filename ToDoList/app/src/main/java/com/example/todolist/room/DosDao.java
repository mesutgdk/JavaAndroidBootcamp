package com.example.todolist.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.todolist.data.repo.ToDoo;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

@Dao
public interface DosDao {
    @Query("SELECT * FROM todos")
    Single<List<ToDoo>> loadAllToDos();

    @Insert
    Completable add(ToDoo todo);

    @Update
    Completable update(ToDoo todo);

    @Delete
    Completable delete(ToDoo todo);

    @Query("SELECT * FROM todos WHERE to_do_name like '%' || :searchWord || '%'")
    Single<List<ToDoo>> search(String searchWord);


}
