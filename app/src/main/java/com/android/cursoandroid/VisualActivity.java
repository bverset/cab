package com.android.cursoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class VisualActivity extends AppCompatActivity implements View.OnClickListener {

    TextView nombre_tv,correo_tv,edad_tv,celular_tv,telefono_tv,grupo_tv;
    String nombre,correo,edad,celular,telefono,grupo;

    Button BtnEliminar,BtnEditar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visual);

        Intent i = getIntent();
        nombre = i.getStringExtra("nombre");
        correo = i.getStringExtra("correo");
        edad = i.getStringExtra("edad");
        celular = i.getStringExtra("celular");
        telefono = i.getStringExtra("telefono");
        grupo = i.getStringExtra("grupo");

        nombre_tv = (TextView) findViewById(R.id.tev_nombre);
        correo_tv = (TextView) findViewById(R.id.tev_correo);
        edad_tv = (TextView) findViewById(R.id.tev_edad);
        celular_tv = (TextView) findViewById(R.id.tev_celular);
        telefono_tv = (TextView) findViewById(R.id.tev_telefono);
        grupo_tv = (TextView) findViewById(R.id.tev_grupo);

        nombre_tv.setText(nombre);
        correo_tv.setText(correo);
        edad_tv.setText(edad);
        celular_tv.setText(celular);
        telefono_tv.setText(telefono);
        grupo_tv.setText(grupo);

        BtnEliminar = (Button) findViewById(R.id.btn_eliminar);
        BtnEliminar.setOnClickListener(this);
        BtnEditar = (Button) findViewById(R.id.btn_editar);
        BtnEditar.setOnClickListener(this);

    }

    public void onClick(View v) {
        int id= v.getId();
        if(id == BtnEliminar.getId()){
            Eliminar(v);
        }
        else if(id == BtnEditar.getId()){
            Editar(v);
        }
    }

    public void Eliminar(View view){
        Intent i2 = new Intent();
        VisualActivity.this.setResult(0, i2);
        VisualActivity.this.finish();
    }
    public void Editar(View view){
        Intent i2 = new Intent();
        VisualActivity.this.setResult(1, i2);
        VisualActivity.this.finish();
    }
}
