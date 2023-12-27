package com.example.inf04_02_2306_sg;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class czcionki extends AppCompatActivity {

    String przywitania[] = {"Dzień Dobry","Good Morning","Buenos dias"};

    int wartoscSuwaka;

    int wskaznik = 1;

    private TextView tekst1;
    private SeekBar suwak;
    private TextView tekst2;
    private Button przycisk;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.czcionka_layout);

        tekst1 = findViewById(R.id.teskt1);
        suwak = findViewById(R.id.suwak);
        tekst2 = findViewById(R.id.tekst2);
        przycisk = findViewById(R.id.przycisk);

        tekst2.setText(przywitania[0]);

        suwak.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {}

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                wartoscSuwaka = suwak.getProgress();

                tekst1.setText("Rozmiar: "+wartoscSuwaka);
                tekst2.setTextSize(wartoscSuwaka);

            }
        });

        przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            wskaznik++;

            if (wskaznik == 1){

                tekst2.setText(przywitania[0]);

            } else if (wskaznik == 2){

                tekst2.setText(przywitania[1]);

            } else if (wskaznik == 3){

                tekst2.setText(przywitania[2]);

                wskaznik = 0;

            }

            }
        });

    }
}
