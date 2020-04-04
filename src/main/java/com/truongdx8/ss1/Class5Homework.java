package com.truongdx8.ss1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Class5Homework extends AppCompatActivity {
    List<Class5HomeworkContact> listContact = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class5_homework);

//        B1: DataSource
        initData();

//        B2: Adapter
        Class5HomeworkContactAdapter adapter = new Class5HomeworkContactAdapter(this,listContact);

//        B3: LayoutManager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

//        B4: RecycleView
        RecyclerView rvBook = findViewById(R.id.rvBook);
        rvBook.setLayoutManager(layoutManager);
        rvBook.setAdapter(adapter);
    }

    public void initData()
    {
        listContact.add(new Class5HomeworkContact("Book1","Book1",10000,R.drawable.book1));
        listContact.add(new Class5HomeworkContact("Book2","Book2",10000,R.drawable.book2));
        listContact.add(new Class5HomeworkContact("Book4","Book4",10000,R.drawable.book4));
        listContact.add(new Class5HomeworkContact("Book7","Book7",10000,R.drawable.book7));
    }
}
