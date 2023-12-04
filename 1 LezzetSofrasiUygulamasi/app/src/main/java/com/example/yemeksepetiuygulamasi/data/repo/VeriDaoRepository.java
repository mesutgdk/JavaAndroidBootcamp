package com.example.yemeksepetiuygulamasi.data.repo;

import androidx.lifecycle.MutableLiveData;

import com.example.yemeksepetiuygulamasi.data.entity.Data;
import com.example.yemeksepetiuygulamasi.room.VeriDao;

import java.util.List;

import io.reactivex.CompletableObserver;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class VeriDaoRepository {
    public MutableLiveData<List<Data>> veriListesi = new MutableLiveData<>();
    private VeriDao kdao;

    public VeriDaoRepository(VeriDao kdao){
        this.kdao = kdao;
    }

  public void kaydet(String begen,String yildiz,String yemek_ad){
        Data data = new Data(0,begen,yildiz,yemek_ad);
        kdao.kaydet(data).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {}
                    @Override
                    public void onComplete() {}
                    @Override
                    public void onError(Throwable e) {}
                });
    }

    public void guncelle(int id,String begen,String yildiz,String yemek_ad){
        Data guncellenenData = new Data(id,begen,yildiz,yemek_ad);
        kdao.guncelle(guncellenenData).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {}
                    @Override
                    public void onComplete() {}
                    @Override
                    public void onError(Throwable e) {}
                });
    }

    public void yemek_adAra(String yemek_ad){
        kdao.idAra(yemek_ad).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<List<Data>>() {
                    @Override
                    public void onSubscribe(Disposable d) {}
                    @Override
                    public void onSuccess(List<Data> verises) {
                        veriListesi.setValue(verises);
                    }
                    @Override
                    public void onError(Throwable e) {}
                });
    }

    public void veriYukle(){
        kdao.veriYukle().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<List<Data>>() {
                    @Override
                    public void onSubscribe(Disposable d) {}
                    @Override
                    public void onSuccess(List<Data> verises) {
                        veriListesi.setValue(verises);
                    }
                    @Override
                    public void onError(Throwable e) {}
                });
    }
}
