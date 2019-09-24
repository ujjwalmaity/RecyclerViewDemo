package com.ujjwal.recyclerviewdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private String[] data;

    RecyclerViewAdapter(String[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_view_layout, parent, false);
//        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return (new RecyclerViewHolder(view));
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewHolder holder, int position) {
        String text = data[position];
        holder.textView.setText(text);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }
}
