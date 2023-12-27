package com.example.listadodatkowezadanie;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class lista extends AppCompatActivity {

    EditText pole;
    Button przycisk;
    ListView lista;
    ArrayList<String> dane;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.lista);

        pole = findViewById(R.id.pole);
        przycisk = findViewById(R.id.przycisk);
        lista = findViewById(R.id.lista);

        dane = new ArrayList<>();

        dane.add("Zakupy:chleb,masło,ser");
        dane.add("Dozrobienia: objad,umyć podłogi");
        dane.add("weekend: kino,spacer z psem");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,dane);
        lista.setAdapter(adapter);

        przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Editable wartoscPole = pole.getText();

                dane.add(wartoscPole.toString());
                adapter.notifyDataSetChanged();
                pole.setText("");

            }
        });

    }
}
