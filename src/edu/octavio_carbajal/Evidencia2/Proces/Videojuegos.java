package edu.octavio_carbajal.Evidencia2.Proces;

public class Videojuegos extends Producto{
    public Videojuegos(String name, String type, double costPerUse, String genre, boolean isNewRelease) {
        super(name, type, costPerUse, genre, isNewRelease);
    }

    @Override
    public double CalcularCosto() {
        return costPorUso + 10;
    }
}
