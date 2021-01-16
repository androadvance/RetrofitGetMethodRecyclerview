package com.example.recyclerviewretrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<Calories> calories;
    private Context context;

    public RecyclerAdapter(List<Calories> calories, Context context) {
        this.calories = calories;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.name.setText(calories.get(position).getName());
        holder.calories.setText("Calories:"+Integer.toString(calories.get(position).getCalories()));
        Glide.with(context).load(calories.get(position).getImage_path()).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return calories.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView name,calories;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageview);
            name = itemView.findViewById(R.id.name);
            calories = itemView.findViewById(R.id.calories);
        }
    }
}
