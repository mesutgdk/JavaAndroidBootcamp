package com.example.lezzetsofrasi.ui.adaptor;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import com.example.lezzetsofrasi.data.entity.Yemekler;
import com.example.lezzetsofrasi.ui.fragment.MainScreenFragment;
import com.example.lezzetsofrasi.ui.viewmodel.MainScreenViewModel;

import java.util.List;

public class YemeklerAdapter {

    private List<Yemekler> yemeklerListesi;

    private Context mContext;

    private MainScreenViewModel viewModel;

    public YemeklerAdapter(List<Yemekler> yemeklerListesi, Context mContext, MainScreenViewModel viewModel) {
        this.yemeklerListesi = yemeklerListesi;
        this.mContext = mContext;
        this.viewModel = viewModel;
    }

}
