package com.company.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RoztworyActivity extends AppCompatActivity {
    private TextView wynik;
    private Button obliczButton;
    private EditText masaSubRozpText;
    private EditText masaRozpText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roztwory);

        masaSubRozpText = findViewById(R.id.masaSubText);
        masaRozpText = findViewById(R.id.masaRozpText);
        obliczButton = findViewById(R.id.obliczButton);
        wynik = findViewById(R.id.wynikView);

        obliczButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (masaSubRozpText.getText().toString().equals("") || masaRozpText.getText().toString().equals("")) {
                    Toast.makeText(RoztworyActivity.this, "Wprowadź dane", Toast.LENGTH_SHORT).show();
                }else {

                    double number1 = Double.parseDouble(masaSubRozpText.getText().toString());
                    double number2 = Double.parseDouble(masaRozpText.getText().toString());

                    double wyswietlanyWynik = (number1/(number1 + number2))*100;

                    wynik.setText(String.valueOf(wyswietlanyWynik) + '%');
                }
            }
        });

    }
}
