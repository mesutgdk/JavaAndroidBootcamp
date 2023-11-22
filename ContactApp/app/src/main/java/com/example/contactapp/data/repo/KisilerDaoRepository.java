package com.example.contactapp.data.repo;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.contactapp.data.entity.Kisiler;
import com.example.contactapp.room.KisilerDao;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.CompletableObserver;
import io.reactivex.Scheduler;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class KisilerDaoRepository {

    //LiveData verisi başlangıç 1
    public MutableLiveData<List<Kisiler>> kisilerListesi = new MutableLiveData<>();

    //bunu dışarda istiyoruz
    private KisilerDao kdao;

    public KisilerDaoRepository(KisilerDao kdao){
        this.kdao = kdao;
    }


    public void kaydet(String kisi_ad,String kisi_tel){
        Kisiler yeniKisi = new Kisiler(0,kisi_ad,kisi_tel);// id int önemli değil, salla, isim ve tel önemli
        kdao.kaydet(yeniKisi).subscribeOn((Schedulers.io()))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {}

                    @Override
                    public void onComplete() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });
    }

    public  void guncelle(int kisi_id,String kisi_ad,String kisi_tel){
        Kisiler guncellenenKisi = new Kisiler(kisi_id,kisi_ad,kisi_tel);// id int önemli değil, salla, isim ve tel önemli
        kdao.kaydet(guncellenenKisi).subscribeOn((Schedulers.io()))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {}

                    @Override
                    public void onComplete() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });
    }


    public void sil(int kisi_id){
        Kisiler silinenKisi = new Kisiler(kisi_id,"","");// id int önemli değil, salla, isim ve tel önemli
        kdao.sil(silinenKisi).subscribeOn((Schedulers.io()))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {}

                    @Override
                    public void onComplete() {
                        kisilerYukle();
                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });
    }

    public void ara(String aramaKelimesi){
        kdao.ara(aramaKelimesi).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<List<Kisiler>>() {
                    @Override
                    public void onSubscribe(Disposable d) {}

                    @Override
                    public void onSuccess(List<Kisiler> kisilers) {
                        kisilerListesi.setValue(kisilers); // bu fonksiyon kisileri alınca bize okuma yapacak
                    }

                    @Override
                    public void onError(Throwable e) {}
                });
    }


    // bu fonksiyon kisileri alınca bize okuma yapacak
    public void kisilerYukle(){
    kdao.kisilerYukle().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(new SingleObserver<List<Kisiler>>() {
                @Override
                public void onSubscribe(Disposable d) {}

                @Override
                public void onSuccess(List<Kisiler> kisilers) {
                    kisilerListesi.setValue(kisilers); // bu fonksiyon kisileri alınca bize okuma yapacak
                }

                @Override
                public void onError(Throwable e) {}
            });
        //LiveData Veri girişi 2
       // kisilerListesi.setValue(liste);
    }
}
