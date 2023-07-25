package com.example.tuitionnotes1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    TextView tvAndroid, tvJava;

    Button btnClick, btnclick1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        tvAndroid = findViewById(R.id.textViewAndroid);
        tvJava = findViewById(R.id.textViewJava);
        btnClick = findViewById(R.id.buttonClick);
        btnclick1 = findViewById(R.id.buttonClick1);


        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ThirdActivity.this, FourthActivity.class);
                startActivity(intent1);


                Toast.makeText(ThirdActivity.this,"You Clicked Android Notes", Toast.LENGTH_SHORT).show();


            }
        });

        btnclick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(ThirdActivity.this, SixthActivity.class);
                startActivity(intent1);


            }
        });



    }
}

