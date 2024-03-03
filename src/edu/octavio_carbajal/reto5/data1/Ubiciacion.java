package edu.octavio_carbajal.reto5.data1;

public class Ubiciacion {
    private double latitude;
    private double longitude;

    public Ubiciacion(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
