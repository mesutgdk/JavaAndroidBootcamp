package com.example.homework4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework4.databinding.FragmentBBinding;

public class BFragment extends Fragment {


    private FragmentBBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBBinding.inflate(inflater, container, false);

        binding.button2YFromB.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.goingYFromB);
        });
        return binding.getRoot();
    }
}