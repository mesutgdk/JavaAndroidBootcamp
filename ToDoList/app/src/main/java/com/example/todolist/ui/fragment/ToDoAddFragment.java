package com.example.todolist.ui.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.todolist.R;
import com.example.todolist.databinding.FragmentToDoAddBinding;
import com.example.todolist.ui.viewmodel.ToDoAddViewModel;

public class ToDoAddFragment extends Fragment {

    private FragmentToDoAddBinding binding;

    private ToDoAddViewModel viewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentToDoAddBinding.inflate(inflater,container,false);

        binding.buttonAdd.setOnClickListener(v -> {
            String toDoName = binding.editTextToDoName.getText().toString();
            Boolean toDoDone = binding.toggleButtonDone.isActivated();

            viewModel.add(toDoName,toDoDone);
        });

        return binding.getRoot();
    }

}