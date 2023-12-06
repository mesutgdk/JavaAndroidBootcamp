package com.example.lezzetsofrasi.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lezzetsofrasi.R;
import com.example.lezzetsofrasi.databinding.FragmentFavoriteScreenBinding;

public class FavoriteScreenFragment extends Fragment {
    private FragmentFavoriteScreenBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFavoriteScreenBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}