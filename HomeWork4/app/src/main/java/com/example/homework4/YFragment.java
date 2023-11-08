package com.example.homework4;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework4.databinding.FragmentYBinding;
import com.google.android.material.snackbar.Snackbar;


public class YFragment extends Fragment {

    private FragmentYBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentYBinding.inflate(inflater,container,false);

        OnBackPressedCallback geriTusu = new OnBackPressedCallback(true) { // geri dönüş tuşu aktif değil
            @Override
            public void handleOnBackPressed() {
                Snackbar.make(binding.textViewY, "Geri Dönmek istiyor musunuz?",Snackbar.LENGTH_SHORT)
                        .setAction("EVET",v -> {
                            setEnabled(false);
                            requireActivity().getOnBackPressedDispatcher().onBackPressed();
                        }).show();
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(),geriTusu);
        return binding.getRoot();
    }
}