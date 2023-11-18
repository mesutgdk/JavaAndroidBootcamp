package com.example.dolapapp.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dolapapp.R;
import com.example.dolapapp.databinding.FragmentDetailedScreenBinding;

public class DetailedScreenFragment extends Fragment {

    private FragmentDetailedScreenBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentDetailedScreenBinding.inflate(inflater,container,false);

        return binding.getRoot();
    }
}