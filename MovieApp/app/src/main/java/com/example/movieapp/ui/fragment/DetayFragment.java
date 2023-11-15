package com.example.movieapp.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.movieapp.R;
import com.example.movieapp.data.entity.Filmler;
import com.example.movieapp.databinding.FragmentDetayBinding;

public class DetayFragment extends Fragment {

    private FragmentDetayBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentDetayBinding.inflate(inflater,container,false);

        DetayFragmentArgs bundle = DetayFragmentArgs.fromBundle(getArguments());
        Filmler film = bundle.getFilm();

        binding.toolbarDetay.setTitle(film.getAd());
        binding.iVFilm.setImageResource(getResources()
                .getIdentifier(film.getResim(),"drawable",requireContext().getPackageName()));

        binding.tVFiyat.setText(film.getFiyat()+" $");

        return binding.getRoot();
    }
}