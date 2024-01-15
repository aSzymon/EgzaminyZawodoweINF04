package com.example.inf04_01_22_01_sg;

import android.annotation.SuppressLint;
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

public class logowanie extends AppCompatActivity {

    private EditText poleEmail;
    private EditText poleHaslo;
    private EditText polePOwtorzHaslo;
    private Button przycisk;
    private TextView wynik;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.logowanie);

        poleEmail = findViewById(R.id.podajEmailPole);
        poleHaslo = findViewById(R.id.podajHasloPole);
        polePOwtorzHaslo = findViewById(R.id.powtorzHasloPole);
        przycisk = findViewById(R.id.przycisk);
        wynik = findViewById(R.id.wynik);

        przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Editable email = poleEmail.getText();
                Editable haslo = poleHaslo.getText();
                Editable powtorzHaslo = polePOwtorzHaslo.getText();

                if (sprawdzanie(String.valueOf(email))){

                    if (String.valueOf(haslo).equals(String.valueOf(powtorzHaslo))){

                        wynik.setText("Witaj "+email);

                    } else {

                        wynik.setText("Hasła się różnią");

                    }

                } else {

                    wynik.setText("Nieprawidłowy adres e-mail");

                }

            }
        });

    }

    boolean sprawdzanie(String email){

        Pattern pattern = Pattern.compile("@");
        Matcher matcher = pattern.matcher(email);

        return matcher.find();

    }


}
