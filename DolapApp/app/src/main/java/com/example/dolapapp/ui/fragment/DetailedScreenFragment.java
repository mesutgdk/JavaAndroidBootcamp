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
import com.example.dolapapp.data.entity.Products;
import com.example.dolapapp.databinding.FragmentDetailedScreenBinding;

import java.util.ArrayList;


public class DetailedScreenFragment extends Fragment {

    private FragmentDetailedScreenBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentDetailedScreenBinding.inflate(inflater,container,false);

        DetailedScreenFragmentArgs bundle = DetailedScreenFragmentArgs.fromBundle(getArguments());

        Products product = bundle.getProduct();

        binding.imageViewPhoto.setImageResource(getResources()
                .getIdentifier(product.getPhoto(),"drawable",requireContext().getPackageName()));

        binding.textViewBrand.setText(product.getBrand().toString() + " TL");

        binding.textViewDescriptionShort.setText(product.getDescriptionShort().toString());

        binding.textViewDescriptionLong.setText(product.getDescriptionLong());

        binding.textViewUsage.setText(product.getUsage());

        binding.textViewColor.setText(product.getColor());

        binding.textViewTitle.setText(product.getTitle());

        String price = String.valueOf(product.getPrice());
        binding.textViewPrice.setText(price + " TL");

        String favorited = String.valueOf(product.getFavorited());
        binding.textViewFavoritedNumber.setText(favorited);



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