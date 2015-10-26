package com.android.cursoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NuevoActivity extends AppCompatActivity {

    EditText nombre_et,correo_et,edad_et,celular_et,telefono_et;
    Spinner grupo_sp;
    String nombre,correo,edad,celular,telefono,grupo;


    @OnClick(R.id.btn_guardar)
    public void guardar(View view){
        nombre = nombre_et.getText().toString();
        correo = correo_et.getText().toString();
        edad = edad_et.getText().toString();
        celular = celular_et.getText().toString();
        telefono = telefono_et.getText().toString();
        grupo = grupo_sp.getSelectedItem().toString();


        Intent i = new Intent(NuevoActivity.this, VisualActivity.class);
        i.putExtra("nombre", nombre);
        i.putExtra("correo", correo);
        i.putExtra("edad", edad);
        i.putExtra("celular", celular);
        i.putExtra("telefono", telefono);
        i.putExtra("grupo", grupo);
        startActivityForResult(i, 0);
        //finish();
    }

        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            if( resultCode==0 ) {
                Toast.makeText(NuevoActivity.this, "Eliminar", Toast.LENGTH_SHORT).show();
                // vaciar los campos button eliminar de visual
                nombre = "";
                nombre_et.setText(nombre);
                correo = "";
                correo_et.setText(correo);
                edad = "";
                edad_et.setText(edad);
                celular = "";
                celular_et.setText(celular);
                telefono = "";
                telefono_et.setText(telefono);
                grupo_sp.setSelection(1);

            }
            else if( resultCode==1 ) {
                Toast.makeText(NuevoActivity.this, "Editar", Toast.LENGTH_SHORT).show();
            }
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo);

        nombre_et = (EditText) findViewById(R.id.edt_nombre);
        correo_et = (EditText) findViewById(R.id.edt_correo);
        edad_et = (EditText) findViewById(R.id.edt_edad);
        celular_et = (EditText) findViewById(R.id.edt_celular);
        telefono_et = (EditText) findViewById(R.id.edt_telefono);
        grupo_sp = (Spinner) findViewById(R.id.spi_grupo);

        ButterKnife.bind(this);
        /*
        toolbar.setTitle("Mi Aplicación");
        toolbar.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(toolbar);
        */

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_msg:
                Toast.makeText(NuevoActivity.this, "Esto es un Toast", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
