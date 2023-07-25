package com.example.tuitionnotes1app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SeventhActivity extends AppCompatActivity {


    ImageView im;

    TextView tvFeatures;

    Button btnPrevious;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        im=findViewById(R.id.imageViewFeatures);
        tvFeatures=findViewById(R.id.textViewFeatures);
        btnPrevious=findViewById(R.id.buttonPrevious);
        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(SeventhActivity.this, SixthActivity.class);
                startActivity(intent1);
                Toast.makeText(SeventhActivity.this, "Go to Previous", Toast.LENGTH_SHORT).show();



            }
        });





    }
}