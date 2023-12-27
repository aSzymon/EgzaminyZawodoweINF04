package com.example.egzamin062022_przykladzadpraktycznego;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class galeria extends AppCompatActivity {

    private ImageView obraz;
    private Button przyciskPoprzedni;
    private Button przyciskNastepny;
    private EditText pole;
    private Switch kontrolka;

    int wskaznik = 1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.galeria_layout);

        obraz = findViewById(R.id.obraz);
        przyciskPoprzedni = findViewById(R.id.przycisk_poprzedni);
        przyciskNastepny = findViewById(R.id.przycisk_nastepny);
        pole = findViewById(R.id.pole);
        kontrolka = findViewById(R.id.kontrolka);

        kontrolka.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (kontrolka.isChecked()){

                    zmienKolorTla();

                } else {

                    powrotKoloruTla();

                }

            }
        });

        pole.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {

                zmianaObrazka();

            }
        });

        przyciskNastepny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(galeria.this, String.valueOf(wskaznik), Toast.LENGTH_SHORT).show();

                if (wskaznik == 1){
                    obraz.setImageResource(R.drawable.kot2);
                    wskaznik = 2;

                } else if (wskaznik == 2) {
                    obraz.setImageResource(R.drawable.kot3);
                    wskaznik = 3;

                } else if (wskaznik == 3){
                    obraz.setImageResource(R.drawable.kot4);
                    wskaznik = 4;

                } else if (wskaznik == 4){

                    obraz.setImageResource(R.drawable.kot1);
                    wskaznik = 1;

                }
            }
        });

        przyciskPoprzedni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //.makeText(galeria.this, String.valueOf(wskaznik), Toast.LENGTH_SHORT).show();

                if (wskaznik == 1) {
                    obraz.setImageResource(R.drawable.kot4);
                    wskaznik = 4;

                } else if (wskaznik == 4){
                    obraz.setImageResource(R.drawable.kot3);
                    wskaznik = 3;

                } else if (wskaznik == 3){
                    obraz.setImageResource(R.drawable.kot2);
                    wskaznik = 2;

                } else if (wskaznik == 2){
                    obraz.setImageResource(R.drawable.kot1);
                    wskaznik = 1;

                }

            }
        });
    }

    private String zmianaObrazka(){

        String wartoscPole = pole.getText().toString();
        //Toast.makeText(galeria.this, wartoscPole, Toast.LENGTH_SHORT).show();

        if (wartoscPole.equals("1")){
            obraz.setImageResource(R.drawable.kot1);
            wskaznik = 1;

        } else if(wartoscPole.equals("2")){
            obraz.setImageResource(R.drawable.kot2);
            wskaznik = 2;

        } else if(wartoscPole.equals("3")){
            obraz.setImageResource(R.drawable.kot3);
            wskaznik = 3;

        } else if(wartoscPole.equals("4")){
            obraz.setImageResource(R.drawable.kot4);
            wskaznik = 4;

        }

        return null;

    }

    private void zmienKolorTla() {
        ConstraintLayout mainLayout = findViewById(R.id.mainLayout);
        mainLayout.setBackgroundColor(Color.parseColor("#1565c0"));

    }

    private void powrotKoloruTla() {
        ConstraintLayout mainLayout = findViewById(R.id.mainLayout);
        mainLayout.setBackgroundColor(Color.parseColor("#00796B"));

    }

}
