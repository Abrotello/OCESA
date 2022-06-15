public class Empleados {
    public String nombre, apellido, correo, CLABE, NSS, RFC, CURP;
    protected int numeroEmpleado;

    public Empleados() {
        this.nombre = "nombre";
        this.apellido = "apellido";
        this.correo = "correo";
        this.CLABE = "CLABE";
        this.NSS = "NSS";
        this.RFC = "RFC";
        this.CURP = "CURP";
        this.numeroEmpleado = 0;
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

    public String getCLABE() {
        return CLABE;
    }

    public void setCLABE(String CLABE) {
        this.CLABE = CLABE;
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

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
}
