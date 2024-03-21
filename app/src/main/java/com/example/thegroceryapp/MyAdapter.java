package com.example.thegroceryapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myViewHolder> {

    private List<Item> itemList;

    public MyAdapter(List<Item> itmList) {
        this.itemList = itmList;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        // Responsible for creating new view for your items

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        return new myViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        //Bind the data from your dataset to the views within the view holder

        Item item= itemList.get(position);
        holder.Title.setText(item.getItemName());
        holder.description.setText(item.getItemDesc());
        holder.imageView.setImageResource(item.getItemImg());
    }

    @Override
    public int getItemCount(){
        //Returns the total number of items in your dataset

        return itemList.size();

    }
    public static class myViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView Title;
        TextView description;
        public myViewHolder(@NonNull View itemView){

            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            Title = itemView.findViewById(R.id.text_Title);
            description= itemView.findViewById(R.id.text2);
        }

    }
}
