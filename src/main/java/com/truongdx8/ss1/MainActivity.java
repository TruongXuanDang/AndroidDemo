package com.truongdx8.ss1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttontLogin;
    TextView tvTitle;
    ImageView ivCover;
    EditText edUser;
    public String Tag = "Log: ";
    Button commentbt;

    ListView lvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);

        //B1: lv contact
        lvContact = findViewById(R.id.lvListView);

        //B2: Datasource
        final String[]data = {"Samsung","LG"};

        //B3: Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        lvContact.setAdapter(adapter);

        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = data[position];
                Log.d("TAG MainActivity", item);
            }
        });

       /* //doan code nay dung cho relativelayout_homework2
        commentbt = findViewById(R.id.abcbtn);
        commentbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goDetailActivity();
            }
        });*/

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
        intent.putExtra("USB","Kingston");
        intent.putExtra("Money",100000);
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
