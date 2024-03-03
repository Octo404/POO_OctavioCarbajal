package edu.octavio_carbajal.reto5.data4;

public class Contacto {
    private String nombre;
    private String direccion;
    private String telefonoCasa;
    private String telefonoTrabajo;

    public Contacto(String nombre, String direccion, String telefonoCasa, String telefonoTrabajo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefonoCasa = telefonoCasa;
        this.telefonoTrabajo = telefonoTrabajo;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public String obtenerTelefonoCasa() {
        return telefonoCasa;
    }

    public String obtenerTelefonoTrabajo() {
        return telefonoTrabajo;
    }
}
