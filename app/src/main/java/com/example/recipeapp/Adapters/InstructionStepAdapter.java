package com.example.recipeapp.Adapters;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class InstructionStepAdapter {


}

class InstructionStepViewHolder extends RecyclerView.ViewHolder {

    TextView  textView_instructions_step_number,textView_instructions_step_title;
    RecyclerView recycler_instruction_equipments, recycler_instruction_ingredients;

    public InstructionStepViewHolder(@NonNull View itemView) {
        super(itemView);


        textView_instructions_step_number = itemView.findViewById(R.id.textView_instructions_step_number);
    }
}
