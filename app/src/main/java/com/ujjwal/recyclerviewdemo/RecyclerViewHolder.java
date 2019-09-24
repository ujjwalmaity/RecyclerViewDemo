package com.ujjwal.recyclerviewdemo;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class RecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView textView;

    RecyclerViewHolder(@NonNull final View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.recycler_view_text_view);
    }
}