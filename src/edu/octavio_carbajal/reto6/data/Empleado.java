package edu.octavio_carbajal.reto6.data;

public class Empleado {
    private String nombreCompleto;
    private int horasTrabajadas;
    private int horasExtrasTrabajadas;
    private String telefono;
    private String fechaNacimiento;
    private Categoria categoria;

    public Empleado(String nombreCompleto, int horasTrabajadas, int horasExtrasTrabajadas, String telefono, String fechaNacimiento, Categoria categoria) {
        this.nombreCompleto = nombreCompleto;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtrasTrabajadas = horasExtrasTrabajadas;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.categoria = categoria;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasExtrasTrabajadas() {
        return horasExtrasTrabajadas;
    }

    public void setHorasExtrasTrabajadas(int horasExtrasTrabajadas) {
        this.horasExtrasTrabajadas = horasExtrasTrabajadas;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
