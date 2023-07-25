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

public class FifthActivity extends AppCompatActivity {

    ImageView im;

    TextView tvArchitecture;
    Button btnPrevious;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        im=findViewById(R.id.imageViewArchitecture);

        tvArchitecture=findViewById(R.id.textViewArchitecture);

        btnPrevious=findViewById(R.id.buttonPrevious);
        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(FifthActivity.this, FourthActivity.class);
                startActivity(intent1);
                Toast.makeText(FifthActivity.this, "Go to Previous", Toast.LENGTH_SHORT).show();

            }
        });




    }
}