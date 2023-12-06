package com.example.lezzetsofrasi.ui.adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.lezzetsofrasi.data.entity.Yemekler;
import com.example.lezzetsofrasi.databinding.CardDesignBinding;
import com.example.lezzetsofrasi.ui.viewmodel.MainScreenViewModel;

import java.util.List;

public class YemeklerAdapter extends RecyclerView.Adapter<YemeklerAdapter.CardDesingHolder>{

    private List<Yemekler> yemeklerListesi;

    private Context mContext;

    private MainScreenViewModel viewModel;

    public YemeklerAdapter(List<Yemekler> yemeklerListesi, Context mContext, MainScreenViewModel viewModel) {
        this.yemeklerListesi = yemeklerListesi;
        this.mContext = mContext;
        this.viewModel = viewModel;
    }



    public class CardDesingHolder extends RecyclerView.ViewHolder{
        private CardDesignBinding design;

        public CardDesingHolder(CardDesignBinding design){
            super(design.getRoot());
            this.design = design;
        }
    }

    @NonNull
    @Override
    public CardDesingHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardDesignBinding binding =
                CardDesignBinding.inflate(LayoutInflater.from(mContext),parent,false);
        return new CardDesingHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardDesingHolder holder, int position) {
        Yemekler yemek = yemeklerListesi.get(position);
        CardDesignBinding t = holder.design;



        t.textViewFiyat.setText(yemek.getYemek_fiyat());
        t.textViewYemekAdi.setText(yemek.getYemek_adi().toString());


    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public void resimGoster(String resimAdi){
        String url = "http://kasimadalan.pe.hu/yemekler/resimler/"+resimAdi;

        Glide.with(this).load(url).override(300,300).into(bindViewHolder(this).imageView);
    }

}
