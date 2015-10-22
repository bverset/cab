package com.android.cursoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txvEstado;
    private String ciclo_vida;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txvEstado = (TextView)findViewById(R.id.tv_estado);
        ciclo_vida= "Estado: onCreate";
        txvEstado.setText(ciclo_vida);
        Log.d("CLASSANDROID", "onCreate");
    }
    protected void onStart() {
        super.onStart();
        ciclo_vida= "Estado: onStart";
        txvEstado.setText(ciclo_vida);
        Log.d("CLASSANDROID","onStart");
    }
    protected void onResume() {
        super.onResume();
        Log.d("CLASSANDROID", "onResume");
    }
    protected void onStop() {
        super.onStop();
        Log.d("CLASSANDROID", "onStop");
    }
    protected void onPause() {
        super.onPause();
        Log.d("CLASSANDROID", "onPause");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CLASSANDROID", "onDestroy");
    }

    public void IniciarActivity(View view){
        Intent starter = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(starter);

    }
    public void FinalizarActivity(View view){
        finish();

    }
}
