package com.truongdx8.ss1;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter {

    private Activity activity;
    private List<BookItem> listbook;

    public BookAdapter(Activity activity, List<BookItem> listbook) {
        this.activity = activity;
        this.listbook = listbook;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = activity.getLayoutInflater().inflate(R.layout.item_booklist,parent,false);
        BookHolder bookHolder = new BookHolder(view);
        return bookHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        BookHolder bookHolder = (BookHolder) holder;
        BookItem bookItem = listbook.get(position);
        bookHolder.tvCover.setImageResource(bookItem.getAvatar());
        bookHolder.tvName.setText(bookItem.getName());
    }

    @Override
    public int getItemCount() {
        return listbook.size();
    }
}
