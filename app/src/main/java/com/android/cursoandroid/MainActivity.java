package com.android.cursoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Mi Aplicación");
    }

    public void iniciarActivity(View view){
        Intent starter = new Intent(getApplicationContext(), SecondActivity.class);
        startActivity(starter);
    }

    public void finalizarActivity(View view){
        finish();

    }
}
