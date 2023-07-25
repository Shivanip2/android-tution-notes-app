package com.example.tuitionnotes1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class secondActivity extends AppCompatActivity {

    EditText etName, etPassword;
    Button btnClick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        etName = findViewById(R.id.editTextName);
        etPassword = findViewById(R.id.editTextPassword);
        btnClick = findViewById(R.id.Click);

        String Name = etName.getText().toString().trim();
        String Password = etPassword.getText().toString().trim();

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if (Name==null || Password==null) {
                Intent intent1 = new Intent(secondActivity.this, ThirdActivity.class);
                startActivity(intent1);

                // Toast.makeText(secondActivity.this, " Please Enter your Correct Name And Pass word",Toast.LENGTH_SHORT).show();


            }

        });


    }
}
