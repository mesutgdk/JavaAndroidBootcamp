package com.example.homework4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework4.databinding.FragmentXBinding;

public class XFragment extends Fragment {

    private FragmentXBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentXBinding.inflate(inflater,container,false);
        // Inflate the layout for this fragment
        binding.button2YFromX.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.goingYFromX);
        });
        return binding.getRoot();
    }
}