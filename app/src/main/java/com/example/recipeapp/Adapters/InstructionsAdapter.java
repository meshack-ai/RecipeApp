package com.example.recipeapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipeapp.Models.InstructionsResponse;
import com.example.recipeapp.R;

import java.util.List;

public class InstructionsAdapter extends  RecyclerView.Adapter<InstrucitonsViewHolder> {
   Context context;
   List<InstructionsResponse> list;

    public InstructionsAdapter(Context context, List<InstructionsResponse> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public InstrucitonsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InstrucitonsViewHolder(LayoutInflater.from(context).inflate(R.layout.list_instructions,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull InstrucitonsViewHolder holder, int position) {

        holder.textView_instruction_name.setText(list.get(position).name);
        holder.recycler_instruction_steps.setHasFixedSize(true);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

class InstrucitonsViewHolder extends RecyclerView.ViewHolder{


 TextView textView_instruction_name;
 RecyclerView recycler_instruction_steps;
    public InstrucitonsViewHolder(@NonNull View itemView) {
        super(itemView);

        textView_instruction_name = itemView.findViewById(R.id.textView_instruction_name);
        recycler_instruction_steps = itemView.findViewById(R.id.recycler_instruction_steps);
    }
}
