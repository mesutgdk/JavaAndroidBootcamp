package com.example.todolist.ui.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.example.todolist.R;
import com.example.todolist.databinding.FragmentMainScreenBinding;
import com.example.todolist.ui.adapter.ToDoAdaptor;
import com.example.todolist.ui.viewmodel.MainScreenViewModel;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainScreenFragment extends Fragment {

    private FragmentMainScreenBinding binding;

    private MainScreenViewModel viewModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentMainScreenBinding.inflate(inflater,container,false);

        binding.toDoRV.setLayoutManager(new LinearLayoutManager(requireContext()));

        viewModel.toDoList.observe(getViewLifecycleOwner(),toDosList -> {
            ToDoAdaptor adaptor = new ToDoAdaptor(toDosList,requireContext(),viewModel);
            binding.toDoRV.setAdapter(adaptor);
        });
        binding.fab.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.goToAddFragment);
        });

        binding.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {//Klavye üzerindeki arama iconu ile çalışır.
                viewModel.search(query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {//Harf girdikçe veya sildikçe çalışır.
                viewModel.search(newText);
                return true;
            }
        });
        return binding.getRoot();
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(MainScreenViewModel.class);
        //viewModel.loadToDos();
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.loadToDos();
    }
}