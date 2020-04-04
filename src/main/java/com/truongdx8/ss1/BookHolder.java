package com.truongdx8.ss1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookHolder extends RecyclerView.ViewHolder {

    ImageView tvCover;
    TextView tvName;

    public BookHolder(@NonNull View itemView) {
        super(itemView);
        tvCover = itemView.findViewById(R.id.ivBookListCover);
        tvName = itemView.findViewById(R.id.tvBookListName);
    }
}
