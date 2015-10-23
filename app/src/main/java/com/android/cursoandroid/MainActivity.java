package com.android.cursoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.toolbar) Toolbar toolbar;
    Button btnIniciar,btnFinalizar;

    // on peut ausi utiliser
    // @OnClick pour relier les boutons


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

       // toolbar = (Toolbar) findViewById(R.id.toolbar);  remplace par @Bind
        toolbar.setTitle("Applicacion de Ben");
        toolbar.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(toolbar);

        btnIniciar = (Button) findViewById(R.id.btn_iniciar);
        /*
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                IniciarActivity(v);
            }
        });
        */
        btnFinalizar = (Button) findViewById(R.id.btn_finalizar);
        /*
        btnFinalizar.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
                 FinalizarActivity(v);
            }
        });
        */

        btnIniciar.setOnClickListener(this);
        btnFinalizar.setOnClickListener(this);


    }

    public void onClick(View v) {
        int id= v.getId();
        if(id == btnIniciar.getId()){
            IniciarActivity(v);
        }
        else if(id == btnFinalizar.getId()){
            FinalizarActivity(v);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_msg:
                Toast.makeText(MainActivity.this,"Hola soiy un toast", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void IniciarActivity(View view){
        Intent starter = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(starter);

    }
    public void FinalizarActivity(View view){
        finish();

    }


}
