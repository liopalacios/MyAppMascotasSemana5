package com.example.hp.myappmascotas;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;


public class AcercaActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca);
       // TextView tvContacto = (TextView)findViewById(R.id.tvAcerca);
       // tvContacto.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBarMain);
        miActionBar.setTitle("mi page mascotas");
        miActionBar.setSubtitle("mi ranking");
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
