package com.truongdx8.ss1;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListView_ContactActivity extends AppCompatActivity {

    ListView lvContact;
    List<Contact> contactList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view__contact);

        //B1
        initData();
        //B2
        ContactAdapter adapter = new ContactAdapter(this,contactList);

        //B3

        lvContact = findViewById(R.id.listview);
        lvContact.setAdapter(adapter);

    }

    private void initData()
    {
        contactList.add(new Contact("A","123",R.drawable.bean));
        contactList.add(new Contact("B","123",R.drawable.bean));
        contactList.add(new Contact("C","123",R.drawable.bean));
        contactList.add(new Contact("D","123",R.drawable.bean));
    }

}
