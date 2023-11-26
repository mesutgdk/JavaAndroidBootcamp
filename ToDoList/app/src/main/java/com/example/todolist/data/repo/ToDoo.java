package com.example.todolist.data.repo;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "todos")
public class ToDoo implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "do_id")
    @NonNull
    private int to_do_id;

    @ColumnInfo(name = "do_name")
    @NonNull
    private String to_do_name;


    @ColumnInfo(name = "do_done")
    @NonNull
    private boolean to_do_done;

    public ToDoo() {
    }

    public ToDoo(int to_do_id, @NonNull String to_do_name, boolean to_do_done) {
        this.to_do_id = to_do_id;
        this.to_do_name = to_do_name;
        this.to_do_done = to_do_done;
    }

    public int getTo_do_id() {
        return to_do_id;
    }

    public void setTo_do_id(int to_do_id) {
        this.to_do_id = to_do_id;
    }

    @NonNull
    public String getTo_do_name() {
        return to_do_name;
    }

    public void setTo_do_name(@NonNull String to_do_name) {
        this.to_do_name = to_do_name;
    }

    public boolean isTo_do_done() {
        return to_do_done;
    }

    public void setTo_do_done(boolean to_do_done) {
        this.to_do_done = to_do_done;
    }
}
