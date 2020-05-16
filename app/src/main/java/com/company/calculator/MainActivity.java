package com.company.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otworzProcentowe();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otworzMolowe();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otworzRoztwory();
            }
        });
    }

    public void otworzProcentowe() {
        Intent intent = new Intent(this, ProcentoweActivity.class);
        startActivity(intent);
    }
    public void otworzMolowe() {
        Intent intent = new Intent(this, MoloweActivity.class);
        startActivity(intent);
    }
    public void otworzRoztwory() {
        Intent intent = new Intent(this, RoztworyActivity.class);
        startActivity(intent);
    }
}
