package com.example.ocesa;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    private EditText nombreRegistro, apellidoRegistro, correoRegistro, CLABE, NSS, RFC, CURP;
    private Spinner puestoRegistro;
    private String contrasena = "123456";

    public static int registrosTotales = 10;

    /*
        REGISTROS ES LA VARIABLE QUE QUIERO  UTILIZAR EN LA CLASE MAIN


     */
    public static int registros = 0;
    public static Empleados[] empleados = new Empleados[registrosTotales];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        //Asociar UI con las variables
        nombreRegistro = (EditText) findViewById(R.id.txtNombreRegistro);
        apellidoRegistro = (EditText) findViewById(R.id.txtApellidoRegistro);
        correoRegistro = (EditText) findViewById(R.id.txtCorreoRegistro);
        CLABE = (EditText) findViewById(R.id.txtCLABE);
        NSS = (EditText) findViewById(R.id.txtNSS);
        RFC = (EditText) findViewById(R.id.txtRFC);
        CURP = (EditText) findViewById(R.id.txtCURP);
        puestoRegistro = (Spinner) findViewById(R.id.sPuesto);

        //Llenar spinner
        String[] puestos = {"Stage hand", "Climber", "Rigger Ground", "Rigger", "Crew Chief"};
        ArrayAdapter<String> puestosAdapter = new ArrayAdapter<>(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item, puestos);
        puestoRegistro.setAdapter(puestosAdapter);

        for (int i=0; i<registrosTotales; i++)
            empleados[i] = new Empleados();
    }

    public void registrarEmpleado(View view) {
        int codigoEmpleado, CLABE_;

        if(nombreRegistro.getText().toString().isEmpty() && apellidoRegistro.getText().toString().isEmpty() && correoRegistro.getText().toString().isEmpty() && CLABE.getText().toString().isEmpty() && NSS.getText().toString().isEmpty() && RFC.getText().toString().isEmpty() && CURP.getText().toString().isEmpty()) {
            Toast.makeText(this, "Favor de llenar todos los campos adecuadamente", Toast.LENGTH_SHORT).show();
            limpiarCampos();
        } else if(registros < registrosTotales) {
            codigoEmpleado = (int) (Math.random()*(200-1));
            CLABE_ = Integer.parseInt(CLABE.getText().toString());

            empleados[registros].setNumeroEmpleado(codigoEmpleado);
            empleados[registros].setNombre(nombreRegistro.getText().toString());
            empleados[registros].setApellido(apellidoRegistro.getText().toString());
            empleados[registros].setCorreo(correoRegistro.getText().toString());
            empleados[registros].setCLABE(CLABE_);
            empleados[registros].setNSS(NSS.getText().toString());
            empleados[registros].setRFC(RFC.getText().toString());
            empleados[registros].setCURP(CURP.getText().toString());
            empleados[registros].setPuesto(puestoRegistro.getSelectedItem().toString());
            empleados[registros].setContrasena(contrasena.toString());

            Toast.makeText(this, "Codigo de empleado: " + empleados[registros].getNumeroEmpleado(), Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Tu contraseña por defecto es: 123456", Toast.LENGTH_LONG).show();
            limpiarCampos();
            registros++;
            System.out.println(registros);

        } else {
            Toast.makeText(this, "Sin cupo, lo sentimos", Toast.LENGTH_SHORT).show();
        }
    }


    public void limpiarCampos() {
        nombreRegistro.setText("");
        apellidoRegistro.setText("");
        correoRegistro.setText("");
        CLABE.setText("");
        NSS.setText("");
        RFC.setText("");
        CURP.setText("");
        puestoRegistro.setAdapter(puestoRegistro.getAdapter());

        nombreRegistro.setHint("Nombre");
        apellidoRegistro.setHint("Apellido");
        correoRegistro.setHint("Correo electrónico");
        CLABE.setHint("CLABE");
        NSS.setHint("Numero de Seguridad Social");
        RFC.setHint("RFC");
        CURP.setHint("CURP");
    }


    public void mainActivity (View view) {
        Intent pantallaPrincipal = new Intent(this, MainActivity.class);
        startActivity(pantallaPrincipal);
    }
}