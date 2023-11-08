package com.example.homework4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework4.databinding.FragmentABinding;


public class AFragment extends Fragment {

    private FragmentABinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentABinding.inflate(inflater,container,false);

        binding.button2GoB.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.goingB);
        });

        return binding.getRoot();
    }
}