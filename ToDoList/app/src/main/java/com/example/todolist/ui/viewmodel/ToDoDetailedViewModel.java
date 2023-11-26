package com.example.todolist.ui.viewmodel;

import androidx.lifecycle.ViewModel;

import com.example.todolist.data.repo.ToDoDaoRepository;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class ToDoDetailedViewModel extends ViewModel {
    private ToDoDaoRepository trepo;

    @Inject
    public ToDoDetailedViewModel(ToDoDaoRepository trepo){
        this.trepo = trepo;
    }

    public void update(int toDoId,String toDoName, boolean toDoDone){
        trepo.update(toDoId,toDoName,toDoDone);
    }
}
