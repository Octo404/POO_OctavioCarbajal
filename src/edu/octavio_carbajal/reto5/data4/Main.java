package edu.octavio_carbajal.reto5.data4;

public class Main {
    public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica();

        Contacto contacto1 = new Contacto("Juan", "Calle A 123", "123456789", "987654321");
        Contacto contacto2 = new Contacto("María", "Calle B 456", "987654321", "123456789");
        agenda.agregarContacto(contacto1);
        agenda.agregarContacto(contacto2);

        agenda.mostrarContactos();

        Contacto encontrado = agenda.buscarContacto("Juan");
        if (encontrado != null) {
            System.out.println("Contacto encontrado: " + encontrado.obtenerNombre());
        } else {
            System.out.println("Contacto no encontrado.");
        }

        agenda.eliminarContacto("María");

        agenda.mostrarContactos();
    }
}
