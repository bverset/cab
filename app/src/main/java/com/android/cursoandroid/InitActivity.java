package com.android.cursoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class InitActivity extends AppCompatActivity implements View.OnClickListener {

    Button BtnNuevo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_init);


        BtnNuevo = (Button) findViewById(R.id.btn_nuevo);
        BtnNuevo.setOnClickListener(this);

        /*int TIME = 3000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                Intent i = new Intent(InitActivity.this, NuevoActivity.class);
                startActivity(i);
                finish();
            }
        }, TIME);
        */
    }

    public void onClick(View v) {
        int id= v.getId();
        if(id == BtnNuevo.getId()){
            Nuevo(v);
        }
    }

    public void Nuevo(View view){
        Intent i = new Intent(InitActivity.this, NuevoActivity.class);
        startActivity(i);
        finish();
    }
}
