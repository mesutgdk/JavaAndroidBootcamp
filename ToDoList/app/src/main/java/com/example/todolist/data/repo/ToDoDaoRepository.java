package com.example.todolist.data.repo;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.todolist.room.DosDao;

import java.util.List;

import io.reactivex.CompletableObserver;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class ToDoDaoRepository {

    public MutableLiveData<List<ToDoo>> toDoList = new MutableLiveData<>();

    private DosDao tdao;


    public ToDoDaoRepository(DosDao tdao) {
        this.tdao = tdao;
    }

    public void save(String toDoName, boolean toDoDone){
       ToDoo newToDo = new ToDoo(0,toDoName,toDoDone);

       tdao.add(newToDo).subscribeOn(Schedulers.io())
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

    public  void  update (int toDoId, String toDoName, boolean toDoDone){
        ToDoo updatedToDo = new ToDoo(toDoId,toDoName,toDoDone);

        tdao.update(updatedToDo).subscribeOn(Schedulers.io())
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

    public void search(String searchWord){
        tdao.search(searchWord).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<List<ToDoo>>() {
                    @Override
                    public void onSubscribe(Disposable d) {}

                    @Override
                    public void onSuccess(List<ToDoo> toDos) {
                        toDoList.setValue(toDos);
                    }

                    @Override
                    public void onError(Throwable e) {}
                });
    }

    public void delete(int toDoId){
        ToDoo deletedTodo = new ToDoo(toDoId,"",true);
        tdao.delete(deletedTodo).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable d) {}

                    @Override
                    public void onComplete() {
                        loadToDos();
                    }

                    @Override
                    public void onError(Throwable e) {}
                });
    }

    public void loadToDos(){
        tdao.loadAllToDos().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<List<ToDoo>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onSuccess(List<ToDoo> toDos) {
                        Log.e("it is loaded","loading is completed");
                        toDoList.setValue(toDos);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });
    }
}
