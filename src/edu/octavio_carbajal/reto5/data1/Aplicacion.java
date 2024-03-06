package edu.octavio_carbajal.reto5.data1;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion {
    private List<Propiedad> propiedadesList;

    public Aplicacion() {
        this.propiedadesList = new ArrayList<>();
        // Aquí podrías inicializar la lista con propiedades existentes o cargarlas desde una base de datos, etc.
    }

    public void searchPropiedades(Ubiciacion location) {
        // Aquí implementa la lógica para buscar propiedades cercanas a la ubicación dada
        // Puedes usar la información de ubicación y compararla con la ubicación de cada propiedad en propertiesList
        // Por simplicidad, este ejemplo simplemente imprime las propiedades en la lista
        for (Propiedad propiedad : propiedadesList) {
            System.out.println("Propiedad ID: " + propiedad.getId());
            System.out.println("Direccion: " + propiedad.getAddress());
            // Agrega más detalles si es necesario
            System.out.println();
        }
    }

    public void addPropiedad(Propiedad propiedad) {
        propiedadesList.add(propiedad);
    }

    public static void main(String[] args) {
        Aplicacion app = new Aplicacion();
        // Supongamos que tienes algunas propiedades predefinidas
        app.addPropiedad(new Propiedad(1, "123 Main St", 200000, 1500, "House", "For Sale"));
        app.addPropiedad(new Propiedad(2, "456 Elm St", 1500, 1200, "Apartment", "For Rent"));

        // Supongamos que se realiza una búsqueda cerca de una ubicación específica
        Ubiciacion searchUbicacion = new Ubiciacion(37.7749, -122.4194);
        app.searchPropiedades(searchUbicacion);
    }
}
