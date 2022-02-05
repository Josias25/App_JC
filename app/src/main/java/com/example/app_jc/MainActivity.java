package com.example.app_jc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
             Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.touch);
        button2 = findViewById(R.id.NewTouch);
        button2.setOnClickListener(this);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Touched the button", Toast.LENGTH_SHORT).show();

            }
        });



    }

    @Override
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(), "You are smart!", Toast.LENGTH_SHORT).show();
    }

    public void NiceJob(View view) {
        Toast.makeText(getApplicationContext(), "You are already a programmer!", Toast.LENGTH_SHORT).show();
    }
}