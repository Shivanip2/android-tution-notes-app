package com.example.tuitionnotes1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SixthActivity extends AppCompatActivity {

    TextView Tv1,Tv2,Tv3;

    Button btnNext,btnPrevious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);


        Tv1=findViewById(R.id.textViewJava);
        Tv2=findViewById(R.id.textViewJava1);
        Tv3=findViewById(R.id.Java);
        btnNext=findViewById(R.id.buttonNext);
        btnPrevious=findViewById(R.id.buttonPrevious);


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(SixthActivity.this, SeventhActivity.class);
                startActivity(intent1);
                Toast.makeText(SixthActivity.this, "You Clicked Next Page", Toast.LENGTH_SHORT).show();

            }
        });
        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(SixthActivity.this, ThirdActivity.class);
                startActivity(intent1);

            }
        });



    }
}