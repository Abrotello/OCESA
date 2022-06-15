package com.example.ocesa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText numeroEmpleado1, contrasena;

    Registro objeto1 = new Registro();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asociar UI con las variables
        numeroEmpleado1 = (EditText) findViewById(R.id.txtNumeroEmpleado);
        contrasena = (EditText) findViewById(R.id.txtContrasena);

    }

    public void iniciarSesion(View view) {
        int codigoEmpleado, posicion = -1;
        boolean encontrado = false;

        /*
                OBJETO1 ES UN OBJETO DE LA CLASE REGISTRO
                LO UTILIZO PARA USAR LA VARIABLE 'REGISTRO'
         */
        //System.out.println(objeto1.empleados[objeto1.registros].getNumeroEmpleado());

        if(!numeroEmpleado1.getText().toString().isEmpty() && !contrasena.getText().toString().isEmpty()) {
            codigoEmpleado = Integer.parseInt(numeroEmpleado1.getText().toString());
            if(objeto1.registros > 0) {
                for(int i=0; i<objeto1.registros; i++) {
                    if (codigoEmpleado == objeto1.empleados[i].getNumeroEmpleado() && contrasena.getText().toString().equals(objeto1.empleados[i].getContrasena())) {
                        Intent pantallaMenu = new Intent(MainActivity.this, Menu.class);
                        startActivity(pantallaMenu);
                    } else {
                        Toast.makeText(this, "Favor de verificar los campos", Toast.LENGTH_SHORT).show();
                        limpiarCampos();
                    }
                }
            } else {
                Toast.makeText(this, "Sin registros, favor de registrarse", Toast.LENGTH_SHORT).show();
                limpiarCampos();
            }
        } else {
            Toast.makeText(this, "Favor de llenar los campos correctamente", Toast.LENGTH_SHORT).show();
            limpiarCampos();
        }

    }

    public void activityRegistro(View view) {
        Intent pantallaRegistro = new Intent(this, Registro.class);
        startActivity(pantallaRegistro);
    }

    public void limpiarCampos() {
        numeroEmpleado1.setText("");
        contrasena.setText("");

        numeroEmpleado1.setHint("Número de empleado");
        contrasena.setHint("Contraseña");
    }
}