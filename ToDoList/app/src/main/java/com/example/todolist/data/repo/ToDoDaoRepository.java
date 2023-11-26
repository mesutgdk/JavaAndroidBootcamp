package com.example.todolist.data.repo;

import androidx.lifecycle.MutableLiveData;

import java.util.List;

import io.reactivex.CompletableObserver;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class ToDoDaoRepository {

    public MutableLiveData<List<ToDos>> toDoList = new MutableLiveData<>();

    private ToDoDao tdao;


    public ToDoDaoRepository(ToDoDao tdao) {
        this.tdao = tdao;
    }

    public void save(String toDoName, boolean toDoDone){
       ToDos newToDo = new ToDos(0,toDoName,toDoDone);

       tdao.addToDo(newToDo).subscribeOn(Schedulers.io())
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
        ToDos updatedToDo = new ToDos(toDoId,toDoName,toDoDone);

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
                .subscribe(new SingleObserver<List<ToDos>>() {
                    @Override
                    public void onSubscribe(Disposable d) {}

                    @Override
                    public void onSuccess(List<ToDos> toDos) {
                        toDoList.setValue(toDos);
                    }

                    @Override
                    public void onError(Throwable e) {}
                });
    }

    public void delete(int toDoId){
        ToDos deletedTodo = new ToDos(toDoId,"",true);
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
                .subscribe(new SingleObserver<List<ToDos>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onSuccess(List<ToDos> toDos) {
                        toDoList.setValue(toDos);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });
    }
}
