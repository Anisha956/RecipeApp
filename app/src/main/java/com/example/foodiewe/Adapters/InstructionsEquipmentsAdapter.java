package com.example.foodiewe.Adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodiewe.Models.Equipment;
import com.example.foodiewe.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class InstructionsEquipmentsAdapter extends RecyclerView.Adapter<InstructionsEquipmentsAdapter.InstructionsEquipmentsViewHolder>{

    Context context;
    List<Equipment> list;

    public InstructionsEquipmentsAdapter(Context context, List<Equipment> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public InstructionsEquipmentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InstructionsEquipmentsViewHolder(LayoutInflater.from(context).inflate(R.layout.list_instructions_step_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull InstructionsEquipmentsViewHolder holder, int position) {

        holder.textView_instructions_step_item.setText(list.get(position).name);
        holder.textView_instructions_step_item.setSelected(true);

        String imageName = list.get(position).image;
        if (imageName != null && !imageName.isEmpty()) {
            String imageUrl;

            if (imageName.startsWith("http")) {
                imageUrl = imageName;
            } else {
                imageUrl = "https://spoonacular.com/cdn/equipment_100x100/" + imageName;
            }

            Log.d("Equipment","final image url : "+ imageUrl);

            Picasso.get()
                    .load(imageUrl)
                    .placeholder(R.drawable.placeholder)
                    .into(holder.imageView_instructions_step_items);

        } else {
            holder.imageView_instructions_step_items.setImageResource(R.drawable.placeholder);
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

public static class  InstructionsEquipmentsViewHolder extends RecyclerView.ViewHolder {
    TextView textView_instructions_step_item;
    ImageView imageView_instructions_step_items;

    public InstructionsEquipmentsViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView_instructions_step_items = itemView.findViewById(R.id.imageView_instructions_step_items);
        textView_instructions_step_item = itemView.findViewById(R.id.textView_instructions_step_item);

    }
}
}