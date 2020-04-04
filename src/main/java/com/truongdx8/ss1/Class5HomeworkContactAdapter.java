package com.truongdx8.ss1;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Class5HomeworkContactAdapter extends RecyclerView.Adapter {
    private Activity activity;
    private List<Class5HomeworkContact> listContact;

    public Class5HomeworkContactAdapter(Activity activity, List<Class5HomeworkContact> listContact) {
        this.activity = activity;
        this.listContact = listContact;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = activity.getLayoutInflater().inflate(R.layout.item_book,parent,false);
        Class5HomeworkContactHolder contactHolder = new Class5HomeworkContactHolder(view);
        return contactHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Class5HomeworkContactHolder contactHolder = (Class5HomeworkContactHolder) holder;
        Class5HomeworkContact data = listContact.get(position);

        contactHolder.ivBookCover.setImageResource(data.getAvatar());
        contactHolder.tvBookName.setText(data.getName());
        contactHolder.tvBookDescription.setText(data.getDescription());
        contactHolder.tvBookPrice.setText(data.getPrice());
    }

    @Override
    public int getItemCount() {

        return listContact.size();
    }

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
}
