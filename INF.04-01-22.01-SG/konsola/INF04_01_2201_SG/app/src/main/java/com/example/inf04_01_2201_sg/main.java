package com.example.inf04_01_2201_sg;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main extends AppCompatActivity {

    private EditText poleEmail;
    private EditText poleHaslo;
    private EditText polePowtorzHaslo;
    private Button przyciskZatwierdz;
    private TextView komunikat;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_layout_main);

        poleEmail = findViewById(R.id.poleEmail);
        poleHaslo = findViewById(R.id.poleHaslo);
        polePowtorzHaslo = findViewById(R.id.polePowtorzHaslo);

        przyciskZatwierdz = findViewById(R.id.przyciskZatwierdz);

        komunikat = findViewById(R.id.komunikat);

        komunikat.setText("00000000000");

        przyciskZatwierdz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Editable wartoscEmailu = poleEmail.getText();
                Editable wartoscHaslo = poleHaslo.getText();
                Editable wartoscPowtorzHaslo = polePowtorzHaslo.getText();

                if (String.valueOf(wartoscHaslo).equals(String.valueOf(wartoscPowtorzHaslo))){

                    if (walidacjaEmail(String.valueOf(wartoscEmailu))){

                        komunikat.setText("Witaj "+wartoscEmailu);

                    } else {

                        komunikat.setText("Nieprawidłowy adres email");

                    }

                } else {

                    komunikat.setText("Hasła się różnią");


                }

            }
        });

    }

    boolean walidacjaEmail(String email){

        Pattern pattern = Pattern.compile("@");
        Matcher matcher = pattern.matcher(email);

        return matcher.find();

    }

}
