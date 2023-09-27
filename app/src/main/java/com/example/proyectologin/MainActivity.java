package com.example.proyectologin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtCorreo, edtContraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtCorreo = (EditText) findViewById(R.id.edtCorreo);
        edtContraseña = (EditText) findViewById(R.id.edtContraseña);

    }
    public void Acceder(View view){
        String username = edtCorreo.getText().toString().trim();
        String password = edtContraseña.getText().toString().trim();

        //Validacion de Campos vacios
        if(username.equals("")){
            Toast.makeText(this, "Ingrese el Correo ", Toast.LENGTH_SHORT).show();
            return;
        }
        if(username.equals("")){
            Toast.makeText(this, "Ingrese la Contraseña ", Toast.LENGTH_SHORT).show();
            return;
        }

        //Validacion Credenciales
        if (username.equals("admin") && password.equals("1234")){
            Intent intent = new Intent(this, Acceder.class);
            startActivity(intent);
            Toast.makeText(this, "Inicio de Sesion Exitoso", Toast.LENGTH_SHORT).show();
            return;
        }else {
            Toast.makeText(this, "Credenciales Incorrectas", Toast.LENGTH_SHORT).show();
        }
    }
}