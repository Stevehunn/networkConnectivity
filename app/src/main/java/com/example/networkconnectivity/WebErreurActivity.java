package com.example.networkconnectivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.fonts.Font;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebView;

public class WebErreurActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_erreur_view);

        //Délai de 5s après l'apparition de la page
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                // Redirection vers L'identification
                Intent mainIntent = new Intent(WebErreurActivity.this, MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, 5000);

    }

}
