package com.truongdx8.ss1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.truongdx8.ss1.R;

public class Class5HomeworkContactHolder extends RecyclerView.ViewHolder {
    ImageView ivBookCover;
    TextView tvBookName;
    TextView tvBookDescription;
    TextView tvBookPrice;

    public Class5HomeworkContactHolder(@NonNull View itemView) {
        super(itemView);
        ivBookCover = itemView.findViewById(R.id.ivBookCover);
        tvBookName = itemView.findViewById(R.id.tvBookName);
        tvBookDescription = itemView.findViewById(R.id.tvBookDescription);
        tvBookPrice = itemView.findViewById(R.id.tvBookPrice);
    }
}
