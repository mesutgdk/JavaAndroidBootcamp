package com.example.todolist.ui.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.todolist.databinding.FragmentToDoDetailedBinding;
import com.example.todolist.ui.viewmodel.ToDoDetailedViewModel;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class ToDoDetailedFragment extends Fragment {

    private FragmentToDoDetailedBinding binding;

    private ToDoDetailedViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentToDoDetailedBinding.inflate(inflater,container,false);

        ToDoDetailedFragmentArgs bundle = ToDoDetailedFragmentArgs.fromBundle(getArguments());

        ToDos toDo = bundle.getToDo();

        binding.editTextToDoName.setText(toDo.getTo_do_name());
//        binding.toggleButtonIsDone.setChecked(toDo.isToDoDone());

        binding.buttonUpdate.setOnClickListener(v -> {
            String toDoName = binding.editTextToDoName.getText().toString();
            Boolean toDoDone = binding.toggleButtonIsDone.isActivated();

            viewModel.update(toDo.getTo_do_id(), toDoName,toDoDone);

        });

        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(ToDoDetailedViewModel.class);
    }
}