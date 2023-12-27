package com.example.inf04_02_2301_sg;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class listaAndr extends AppCompatActivity {

    ArrayList<String> dane;

    private EditText pole;
    private Button przycisk;
    private ListView lista;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.listaandr_layout);

        dane = new ArrayList<>();

        dane.add("Zakupy:chleb,masło,ser");
        dane.add("Dozrobienia: objad,umyć podłogi");
        dane.add("weekend: kino,spacer z psem");

        pole = findViewById(R.id.pole);
        przycisk = findViewById(R.id.przycisk);
        lista = findViewById(R.id.lista);

        ArrayAdapter adapterListy = new ArrayAdapter(this, android.R.layout.simple_list_item_1,dane);
        lista.setAdapter(adapterListy);

        przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Editable wartoscPola = pole.getText();

                if (pole.length() == 0){

                    Toast.makeText(listaAndr.this, "Uzupełnij pole. Nie moze być puste", Toast.LENGTH_SHORT).show();

                } else {

                        dane.add(wartoscPola.toString());
                        adapterListy.notifyDataSetChanged();

                        pole.setText("");

                    }

            }
        });


    }

}
