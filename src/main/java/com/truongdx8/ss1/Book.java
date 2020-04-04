package com.truongdx8.ss1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Book extends AppCompatActivity {

    List<BookItem> listBooks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        initData();

        BookAdapter adapter = new BookAdapter(this,listBooks);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2,LinearLayoutManager.VERTICAL,false);

        RecyclerView rvBook = findViewById(R.id.rvBookList);
        rvBook.setLayoutManager(layoutManager);
        rvBook.setAdapter(adapter);
    }

    public void initData()
    {
        listBooks.add(new BookItem(R.drawable.book1,"Book1"));
        listBooks.add(new BookItem(R.drawable.book4,"Book2"));
        listBooks.add(new BookItem(R.drawable.book7,"Book4"));
        listBooks.add(new BookItem(R.drawable.book1,"Book7"));
    }
}
