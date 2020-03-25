package com.truongdx8.ss1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttontLogin;
    TextView tvTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        buttontLogin = findViewById(R.id.btLogin);
        tvTitle = findViewById(R.id.idTitle);

        //Bat su kien click button
        buttontLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity","Nhan vao nut login");
                tvTitle.setText("Xin chao");
            }
        });
    }
}
