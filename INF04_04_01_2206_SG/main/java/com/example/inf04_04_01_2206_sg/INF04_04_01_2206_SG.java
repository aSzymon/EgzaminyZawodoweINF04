package com.example.inf04_04_01_2206_sg;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class INF04_04_01_2206_SG extends AppCompatActivity {

    int licznik = 0;
    private Button polub;
    private Button usun;
    private TextView liczbikPolubien;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.inf04_04_01_2206_sg);

        polub = findViewById(R.id.przyciskPolub);
        usun = findViewById(R.id.przyciskUsun);
        liczbikPolubien = findViewById(R.id.licznikPolubien);

        polub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                licznik++;
                liczbikPolubien.setText(licznik+" polubień");

            }
        });

        usun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (licznik == -1 || licznik == 0){

                    licznik = 1;

                }

                licznik--;
                liczbikPolubien.setText(licznik+" polubień");

            }
        });

    }
}
