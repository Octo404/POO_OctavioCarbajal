package edu.octavio_carbajal.reto5.data2;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id;
    private String nombre;
    private List<Cuenta> cuentas;

    public Cliente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void addCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public void removeCuenta(Cliente cuenta) {
        cuentas.remove(cuenta);
    }
}
