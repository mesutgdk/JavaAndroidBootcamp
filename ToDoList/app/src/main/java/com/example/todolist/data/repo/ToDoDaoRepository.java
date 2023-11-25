package com.example.todolist.data.repo;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.todolist.data.entity.ToDos;

import java.util.ArrayList;
import java.util.List;

public class ToDoDaoRepository {

    public MutableLiveData<List<ToDos>> toDoList = new MutableLiveData<>();

    public void save(String toDoName, boolean toDoDone){
        Log.e("toDo is + ", toDoName + " is completed: "+ toDoDone);
    }

    public  void  update (int toDoId, String toDoName, boolean toDoDone){
        Log.e("toDo is + ", toDoId + toDoName + " is updated: "+ toDoDone);
    }

    public void search(String searchWord){
        Log.e("toDo is",searchWord);
    }

    public void delete(int kisi_id){
        Log.e("Kişi Sil ",String.valueOf(kisi_id));
        loadToDos();
    }

    public void loadToDos(){
        ArrayList<ToDos> liste = new ArrayList<>();
        ToDos t1 = new ToDos(1,"Pazar Alışverişi",false);
        ToDos t2 = new ToDos(1,"Bootcamp Ödevi",false);
        ToDos t3 = new ToDos(1,"Aile Ziyareti",true);

        liste.add(t1);
        liste.add(t2);
        liste.add(t3);

        toDoList.setValue(liste);
    }
}
