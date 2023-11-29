package com.example.lezzetsofrasi.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lezzetsofrasi.R;
import com.example.lezzetsofrasi.databinding.FragmentCartScreenBinding;

public class CartScreenFragment extends Fragment {

    private FragmentCartScreenBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCartScreenBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}