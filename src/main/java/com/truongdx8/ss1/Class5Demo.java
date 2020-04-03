package com.truongdx8.ss1;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Class5Demo extends AppCompatActivity {
    List<Contact> listContact = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class5_demo);

        //B1: DataSource
        initData();
        //B2: Adapter
        ContactAdapterRecycle adapter1 = new ContactAdapterRecycle(this,listContact);

        //B3: Layout Manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        //B4: RecycleView
        RecyclerView rvContact = findViewById(R.id.rvContact);
        rvContact.setLayoutManager(layoutManager);
        rvContact.setAdapter(adapter1);
    }

    private void initData()
    {
        listContact.add(new Contact("A","123",R.drawable.bean));
        listContact.add(new Contact("B","123",R.drawable.bean));
        listContact.add(new Contact("C","123",R.drawable.bean));
        listContact.add(new Contact("D","123",R.drawable.bean));
    }

}
