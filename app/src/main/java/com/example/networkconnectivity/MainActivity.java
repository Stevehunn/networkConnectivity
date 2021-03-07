package com.example.networkconnectivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String identifiant = "Nicolas";
    String motDePasse = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText identifiantEdit = (EditText) findViewById(R.id.editTextTextIdentifiant);
        EditText motDePasseEdit = (EditText) findViewById(R.id.editTextTextPassword);

        //Bouton pour valider et rediriger
        Button buttonCam = (Button) findViewById(R.id.btValidation);
        buttonCam.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Identifiant et mot de passe fixe
                String identifiantValue = identifiantEdit.getText().toString();
                String motDePasseValue = motDePasseEdit.getText().toString();

                //Vérification de l'identifiant et du mot de passe
                if (identifiant.equals(identifiantValue) && motDePasse.equals(motDePasseValue)) {
                    Log.d("DEBUG", "OnClick valide");
                    startActivity(new Intent(MainActivity.this, WebActivity.class));
                }
                //Sinon problème d'identification
                else {
                    Log.d("DEBUG", "OnClick invalide");
                    startActivity(new Intent(MainActivity.this, WebErreurActivity.class));
                }

            }
        });
    }
}