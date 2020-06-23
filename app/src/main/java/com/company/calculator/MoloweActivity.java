package com.company.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MoloweActivity extends AppCompatActivity {
    private TextView wynik;
    private Button obliczButton;
    private EditText liczbaMoliText;
    private EditText objetoscRozText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_molowe);

        liczbaMoliText = findViewById(R.id.liczbaMoliText);
        objetoscRozText = findViewById(R.id.objetoscRozText);
        obliczButton = findViewById(R.id.obliczButton);
        wynik = findViewById(R.id.wynikView);

        obliczButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (liczbaMoliText.getText().toString().equals("") || objetoscRozText.getText().toString().equals("")) {
                    Toast.makeText(MoloweActivity.this, "Wprowadź dane", Toast.LENGTH_SHORT).show();
                }else {

                    double number1 = Double.parseDouble(liczbaMoliText.getText().toString());
                    double number2 = Double.parseDouble(objetoscRozText.getText().toString());

                    double wyswietlanyWynik = number1/number2;

                    wynik.setText(String.format("%.2f%n", wyswietlanyWynik) + " mol/dm^3");
                }
            }
        });

    }
}
