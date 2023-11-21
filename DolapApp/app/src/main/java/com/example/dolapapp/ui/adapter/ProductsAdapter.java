package com.example.dolapapp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dolapapp.MainActivity;
import com.example.dolapapp.data.entity.Products;
import com.example.dolapapp.databinding.CardDesignBinding;
import com.example.dolapapp.ui.fragment.DetailedScreenFragment;
import com.example.dolapapp.ui.fragment.MainScreenFragmentDirections;



import java.util.List;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.CardDesignHolder> {

    private List<Products> productsList;

    private Context mContext;

    public ProductsAdapter(List<Products> productsList, Context mContext){
        this.productsList = productsList;
        this.mContext = mContext;
    }

    public class CardDesignHolder extends RecyclerView.ViewHolder{
        private CardDesignBinding design;

        public CardDesignHolder(CardDesignBinding design){
            super(design.getRoot());
            this.design = design;
        }
    }

    @NonNull
    @Override
    public CardDesignHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        CardDesignBinding binding =
                CardDesignBinding.inflate(LayoutInflater.from(mContext),parent,false);

        return new CardDesignHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardDesignHolder holder, int position) {

        Products product = productsList.get(position);
        CardDesignBinding t = holder.design;
        t.imageViewMainPhoto.setImageResource(mContext.getResources()
                .getIdentifier(product.getPhoto().toString(),"drawable",mContext.getPackageName()));

        t.textViewCardBrand.setText(product.getBrand());

        t.textViewCardPrice.setText(product.getPrice() + " TL");

        t.textViewCardSize.setText(product.getSize());

        String favorited = String.valueOf(product.getFavorited());
        t.textView4Favoried.setText(favorited);


        t.cardViewDress.setOnClickListener(v -> {

            MainScreenFragmentDirections.GoToDetailed transmission = MainScreenFragmentDirections.goToDetailed(product);

            Navigation.findNavController(v).navigate(transmission);
        });
    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }


}
