package com.example.todolist.data.entity;

import java.io.Serializable;

public class ToDos implements Serializable {

    private int toDoId;
    private String toDoName;
    private boolean toDoDone;

    public ToDos() {
    }

    public ToDos(int toDoId, String toDoName, boolean toDoDone) {
        this.toDoId = toDoId;
        this.toDoName = toDoName;
        this.toDoDone = toDoDone;
    }

    public int getToDoId() {
        return toDoId;
    }

    public void setToDoId(int toDoId) {
        this.toDoId = toDoId;
    }

    public String getToDoName() {
        return toDoName;
    }

    public void setToDoName(String toDoName) {
        this.toDoName = toDoName;
    }

    public boolean isToDoDone() {
        return toDoDone;
    }

    public void setToDoDone(boolean toDoDone) {
        this.toDoDone = toDoDone;
    }
}
