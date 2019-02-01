package com.concordia.cejv669.startactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String name=intent.getStringExtra("Name");
        int age=intent.getIntExtra("Age",0);
        TextView tv=findViewById(R.id.tv_name);
        tv.setText("Hello:"+name+"! You are" + age+" years old");
    }
}
