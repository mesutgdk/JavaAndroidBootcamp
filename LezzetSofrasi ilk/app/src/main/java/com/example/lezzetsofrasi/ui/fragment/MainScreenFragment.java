package com.example.lezzetsofrasi.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lezzetsofrasi.R;
import com.example.lezzetsofrasi.databinding.FragmentMainScreenBinding;
import com.example.lezzetsofrasi.ui.viewmodel.MainScreenViewModel;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainScreenFragment extends Fragment {

    private FragmentMainScreenBinding binding;

    private MainScreenViewModel viewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding = FragmentMainScreenBinding.inflate(inflater,container,false);
        return binding.getRoot();

        binding.yemeklerRv.setLayoutManager(new LinearLayoutManager(requireContext()));

        viewModel.yemeklerListesi.observe(getViewLifecycleOwner(),yemeklerList -> {

        });
    }
}