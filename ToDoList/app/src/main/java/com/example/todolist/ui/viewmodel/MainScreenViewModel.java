package com.example.todolist.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.todolist.data.repo.ToDoDaoRepository;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class MainScreenViewModel extends ViewModel {

    public ToDoDaoRepository trepo;
    public MutableLiveData<List<ToDos>> toDoList;

    @Inject
    public MainScreenViewModel(ToDoDaoRepository trepo){
        this.trepo = trepo;
        loadToDos();
        toDoList = trepo.toDoList;

    }

    public void search(String searchWord){
        trepo.search(searchWord);
    }

    public void delete(int toDoId){
        trepo.delete(toDoId);
    }

    public void loadToDos(){
        trepo.loadToDos();
    }
}
