package com.example.homework4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework4.databinding.FragmentMainBinding;

public class MainFragment extends Fragment {

    private FragmentMainBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater,container,false);
        // Inflate the layout for this fragment

        binding.button2GoA.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.goingA);
        });
        binding.button2GoX.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.goingX);
        });
        return binding.getRoot();
    }
}