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
    private EditText objetoscPoczatkowaText;
    private EditText stezPoczotkoweText;
    private EditText objetoscKoncowaText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roztwory);

        objetoscPoczatkowaText = findViewById(R.id.objetoscPoczatkowaText);
        stezPoczotkoweText = findViewById(R.id.stezPoczotkoweText);
        objetoscKoncowaText = findViewById(R.id.objetoscKoncowaText);
        obliczButton = findViewById(R.id.obliczButton);
        wynik = findViewById(R.id.wynikView);

        obliczButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (objetoscPoczatkowaText.getText().toString().equals("") || stezPoczotkoweText.getText().toString().equals("") ||
                        objetoscKoncowaText.getText().toString().equals("")) {
                    Toast.makeText(RoztworyActivity.this, "Wprowadź dane", Toast.LENGTH_SHORT).show();
                } else {

                    double number1 = Double.parseDouble(objetoscPoczatkowaText.getText().toString());
                    double number2 = Double.parseDouble(stezPoczotkoweText.getText().toString());
                    double number3 = Double.parseDouble(objetoscKoncowaText.getText().toString());

                    double wyswietlanyWynik = number2*number1/number3;

                    wynik.setText(String.valueOf(wyswietlanyWynik) + " mol/dm^3");
                }
            }
        });

    }
}
