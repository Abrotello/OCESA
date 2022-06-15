package com.example.ocesa;

public class Empleados {
    private String nombre, apellido, correo, NSS, RFC, CURP, puesto, contrasena;
    private int CLABE;
    private int numeroEmpleado;

    public Empleados() {
        this.nombre = "";
        this.apellido = "";
        this.correo = "";
        this.NSS = "";
        this.RFC = "";
        this.CURP = "";
        this.puesto = "";
        this.contrasena = "";
        this.CLABE = 0;
        this.numeroEmpleado = 0;
    }

    public Empleados(String nombre, String apellido, String correo, String NSS, String RFC, String CURP, String puesto, String contrasena, int CLABE, int numeroEmpleado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.NSS = NSS;
        this.RFC = RFC;
        this.CURP = CURP;
        this.puesto = puesto;
        this.contrasena = contrasena;
        this.CLABE = CLABE;
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getCLABE() {
        return CLABE;
    }

    public void setCLABE(int CLABE) {
        this.CLABE = CLABE;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
}

