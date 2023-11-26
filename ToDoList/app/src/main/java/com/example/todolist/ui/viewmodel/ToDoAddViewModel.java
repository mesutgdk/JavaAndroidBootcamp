package com.example.todolist.ui.viewmodel;

import androidx.lifecycle.ViewModel;

import com.example.todolist.data.repo.ToDoDaoRepository;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class ToDoAddViewModel extends ViewModel {

    private ToDoDaoRepository trepo;

    @Inject
    public ToDoAddViewModel(ToDoDaoRepository trepo){
        this.trepo = trepo;
    }

    public void add(String toDoName, boolean toDoDone){
        trepo.save(toDoName,toDoDone);
    }
}
