package com.example.todolist.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.todolist.databinding.CardDesignBinding;
import com.example.todolist.ui.fragment.MainScreenFragmentDirections;
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
        CardDesignBinding binding =
                CardDesignBinding.inflate(LayoutInflater.from(mContext),parent,false);

        return new CardDesignHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardDesignHolder holder, int position) {
        ToDos toDo = toDosList.get(position);
        CardDesignBinding t = holder.design;

        t.textViewToDoName.setText(toDo.getTo_do_name());

        t.doneImageView.setImageResource(mContext.getResources()
                //terniary operator to select if it is selected done or not
                .getIdentifier(toDo.isTo_do_done() == true ? "its_done":"not_done","drawable",mContext.getPackageName()));

        t.deleteImageView.setOnClickListener(v -> {
            Snackbar.make(v,toDo.getTo_do_name()+" silinsin mi?", Snackbar.LENGTH_SHORT)
                    .setAction("EVET",v1 -> {
                        viewModel.delete(toDo.getTo_do_id());
                    })
                    .show();
        });
        t.cardViewToDo.setOnClickListener(v -> {
            MainScreenFragmentDirections.GoToDetailedFragment enterDetail = MainScreenFragmentDirections.goToDetailedFragment(toDo);
            Navigation.findNavController(v).navigate(enterDetail);

        });
    }

    @Override
    public int getItemCount() {
        return toDosList.size();
    }


}
