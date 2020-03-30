package com.truongdx8.ss1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView tvUSB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        String usb = intent.getStringExtra("USB");
        int money = intent.getIntExtra("Money",0);

        tvUSB = findViewById(R.id.tbUsb);
        tvUSB.setText(usb);
    }

}
