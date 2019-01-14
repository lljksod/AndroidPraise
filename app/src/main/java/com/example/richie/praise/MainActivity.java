package com.example.richie.praise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button yes_button_reference = findViewById(R.id.yes_button);
        final Button no_button_reference = findViewById(R.id.no_button);

        yes_button_reference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), R.string.yes_click_string,Toast.LENGTH_SHORT).show();
            }
        });

        no_button_reference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), R.string.no_click_string,Toast.LENGTH_SHORT).show();
            }
        });
    }



    }
