package edu.octavio_carbajal.Evidencia2.Proces;

public class Pelicula extends Producto{
    public Pelicula(String name, String type, double costPorUso, String genre, boolean newRelease) {
        super(name, type, costPorUso, genre, newRelease);
    }
        @Override
    public double CalcularCosto() {
        return newRelease ? costPorUso + 15 : costPorUso;
    }
}

