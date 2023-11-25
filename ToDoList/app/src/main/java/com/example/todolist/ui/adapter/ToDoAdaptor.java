package com.example.todolist.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.todolist.data.entity.ToDos;
import com.example.todolist.databinding.CardDesignBinding;
import com.example.todolist.ui.fragment.MainScreenFragment;
import com.example.todolist.ui.viewmodel.MainScreenViewModel;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class ToDoAdaptor extends RecyclerView.Adapter<ToDoAdaptor.CardDesignHolder> {

    private List<ToDos> toDosList;

    private Context mContext;

    private MainScreenViewModel viewModel;

    public ToDoAdaptor(List<ToDos> toDosList, Context mContext, MainScreenViewModel viewModel) {
        this.toDosList = toDosList;
        this.mContext = mContext;
        this.viewModel = viewModel;
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
        CardDesignBinding binding = CardDesignBinding
                .inflate(LayoutInflater.from(mContext),parent,false);

        return new CardDesignHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardDesignHolder holder, int position) {
        ToDos toDos = toDosList.get(position);
        CardDesignBinding t = holder.design;

        t.textViewToDoName.setText(toDos.getToDoName());

        t.doneImageView.setImageResource(mContext.getResources()
                //terniary operator to select if it is selected done or not
                .getIdentifier(toDos.isToDoDone() == true ? "its_done":"not_done","drawable",mContext.getPackageName()));

        t.deleteImageView.setOnClickListener(v -> {
            Snackbar.make(v,toDos.getToDoName()+" silinsin mi?", Snackbar.LENGTH_SHORT)
                    .setAction("EVET",v1 -> {
                        viewModel.delete(toDos.getToDoId());
                    })
                    .show();
        });
        t.cardViewToDo.setOnClickListener(v -> {

        });
    }

    @Override
    public int getItemCount() {
        return toDosList.size();
    }


}
