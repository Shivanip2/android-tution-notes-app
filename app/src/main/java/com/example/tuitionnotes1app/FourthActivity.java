package com.example.tuitionnotes1app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {


    TextView Tv1,Tv2,Tv3;
    Button btnNext,btnPrevious;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Tv1=findViewById(R.id.textViewAndroid);
        Tv2=findViewById(R.id.textViewAndroid1);
        Tv3=findViewById(R.id.Android);
        btnNext=findViewById(R.id.buttonNext);
        btnPrevious=findViewById(R.id.buttonPrevious);


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(FourthActivity.this, FifthActivity.class);
                startActivity(intent1);

            }
        });
        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(FourthActivity.this, ThirdActivity.class);
                startActivity(intent1);

            }
        });



    }
}