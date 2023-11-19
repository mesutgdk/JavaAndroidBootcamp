package com.example.dolapapp.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dolapapp.R;
import com.example.dolapapp.data.entity.Products;
import com.example.dolapapp.databinding.FragmentMainScreenBinding;
import com.example.dolapapp.ui.adapter.ProductsAdapter;

import java.util.ArrayList;

public class MainScreenFragment extends Fragment {

    private FragmentMainScreenBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainScreenBinding.inflate(inflater,container,false);

        ArrayList<Products> productsList = new ArrayList<>();

        Products p1 = new Products(1,"12_18 ay kışlık","beyaztakim","12-18 ay/86cm","Bebek&Çocuk Takım","Ürün kullanılmıştır, ihtiyaç fazlasıdır.","Az kullanılmış","LC Waikiki","Bej",28,39);
        Products p2 = new Products(2,"Bebek kazak takım","kazak","18-24 ay/92cm","Bebek&Çocuk Alt&Üst Takım","Defacto marka, ürünlerimiz sıfır ürünlerdir..","Yeni/Etiketli","Diğer","K.Rengi",14,150);
        Products p3 = new Products(3,"Külotlu çorap","corap","24-36 ay","Bebek&Çocuk Eldiven&Çorap","LCW marka külotlu çorap, alana hayırlı olsun.","Yeni&Etiketli","LC Waikiki","Beyaz",39,75);
        Products p4 = new Products(4,"ELBİSE","elbise","M/38","Kadın Ofis Elbisesi","Hiçbir kusuru yoktur, birazcık rengi solmuştur, oda fotoda belli oluyor.","Az kullanılmış","Mango","Pembe",99,210);
        Products p5 = new Products(5,"Ycoo Robot Köpek","kopek"," ","Bebek&Çocuk Kumanda & Akülü Araçlar","Kızımın ilgisini hiç çekmedi, eşim adeta kendisi için aldı, ikisi de oynamadı :)","Az kullanılmış","Diğer","Gri",58,650);
        Products p6 = new Products(6,"Zara marka pantolon","pantolon","18-24 ay/92cm","Bebek&Çocuk Pantolon","Ürünlerimiz ihracat fazlası olup sıfırdır. İç etiketleri kesik olabilir","Yeni&Etiketli","Zara","Desenli",64,180);
        Products p7 = new Products(7,"Aslan Baskılı Erkek Bebek Takım","renklitakim","12-18 ay/86cm","Bebek&Çocuk Takım","Yıkama derecesi: 30C. Elde yıkama yapmayınız, %100 pamuktan üretilmiştir.","Yeni&Etiketli","Diğer","Bej",28,39);

        productsList.add(p1);
        productsList.add(p2);
        productsList.add(p3);
        productsList.add(p4);
        productsList.add(p5);
        productsList.add(p6);
        productsList.add(p7);

        //ProductsAdapter productsAdapter = new ProductsAdapter(productsList,requireContext());
        //binding.productsRV.setAdapter(productsAdapter);

        return binding.getRoot();
    }
}