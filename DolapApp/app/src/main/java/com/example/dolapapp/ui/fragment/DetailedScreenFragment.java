package com.example.dolapapp.ui.fragment;

import static android.R.layout.activity_list_item;
import static android.R.layout.simple_expandable_list_item_1;
import static android.R.layout.simple_list_item_1;


import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.dolapapp.R;
import com.example.dolapapp.databinding.FragmentDetailedScreenBinding;

import java.util.ArrayList;


public class DetailedScreenFragment extends Fragment {

    private FragmentDetailedScreenBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentDetailedScreenBinding.inflate(inflater,container,false);

        ArrayList<String> taksitArray = new ArrayList<>();
        taksitArray.add("Peşin fiyatına 1 taksit");
        taksitArray.add("Peşin fiyatına 2 taksit");
        taksitArray.add("Peşin fiyatına 3 taksit");

        ArrayAdapter arrayAdapter;
        arrayAdapter = new ArrayAdapter(getActivity().getApplicationContext(), simple_list_item_1,taksitArray);
        binding.taksit.setAdapter(arrayAdapter);

        return binding.getRoot();
    }
}