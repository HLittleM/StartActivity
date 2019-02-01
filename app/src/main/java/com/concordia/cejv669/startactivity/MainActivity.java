package com.concordia.cejv669.startactivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=findViewById(R.id.btn_goToOtherPage);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(i);
            }
        });

        Button b2=findViewById(R.id.btn_goToGoogle);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.ca"));
                startActivity(i);
            }
        });

        Button b3=findViewById(R.id.btn_goToWithData);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), Main2Activity.class);
                EditText edt_name=findViewById(R.id.edt_name);
                EditText edt_age=findViewById(R.id.edt_age);
                String name=edt_name.getText().toString();
                int age=Integer.parseInt(edt_age.getText().toString());
                i.putExtra("Name",name);
                i.putExtra("Age",age);
                startActivity(i);
            }
        });

    }
}
