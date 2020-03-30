package com.truongdx8.ss1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttontLogin;
    TextView tvTitle;
    ImageView ivCover;
    EditText edUser;
    public String Tag = "Log: ";
    Button commentbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relativelayout_homework2);
        commentbt = findViewById(R.id.commentbt);
        commentbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goDetailActivity();
            }
        });

      /*//Doan code nay dung cho page activity_demo
        buttontLogin = findViewById(R.id.btLogin);
        tvTitle = findViewById(R.id.idTitle);
        ivCover = findViewById(R.id.imgCover);
        edUser = findViewById(R.id.eUser);

        //Bat su kien click button
        buttontLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity","Nhan vao nut login");
                tvTitle.setText("Xin chao");
                ivCover.setImageResource(R.drawable.bean);
                String userName = edUser.getText().toString();
                tvTitle.setText(userName);
            }
        });*/
    }

    private void goDetailActivity(){

        Intent intent = new Intent(MainActivity.this,DetailActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Tag,"OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Tag,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Tag,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Tag,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Tag,"onDestroy");
    }
}
