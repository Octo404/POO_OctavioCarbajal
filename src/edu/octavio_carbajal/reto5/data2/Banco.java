package edu.octavio_carbajal.reto5.data2;

import java.util.ArrayList;
import java.util.List;

class Banco {
    private List<Cliente> clientes;

    public Banco() {
        this.clientes = new ArrayList<>();
    }

    public void addCliente(Cliente customer) {
        clientes.add(customer);
    }

    public void removeClienta(Cliente cliente) {
        clientes.remove(cliente);
    }

    public Cliente findClienteById(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null; // Retorna null si no se encuentra el cliente con el ID especificado
    }
}
