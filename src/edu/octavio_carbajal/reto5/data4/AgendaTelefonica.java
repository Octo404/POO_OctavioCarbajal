package edu.octavio_carbajal.reto5.data4;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
    private List<Contacto> contactos;

    public AgendaTelefonica() {
        contactos = new ArrayList<>();
    }

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public Contacto buscarContacto(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.obtenerNombre().equals(nombre)) {
                return contacto;
            }
        }
        return null;
    }

    public void eliminarContacto(String nombre) {
        Contacto contacto = buscarContacto(nombre);
        if (contacto != null) {
            contactos.remove(contacto);
        }
    }

    public void mostrarContactos() {
        System.out.println("Lista de contactos:");
        for (Contacto contacto : contactos) {
            System.out.println("- Nombre: " + contacto.obtenerNombre());
            System.out.println("  Dirección: " + contacto.obtenerDireccion());
            System.out.println("  Teléfono de casa: " + contacto.obtenerTelefonoCasa());
            System.out.println("  Teléfono de trabajo: " + contacto.obtenerTelefonoTrabajo());
        }
    }
}
