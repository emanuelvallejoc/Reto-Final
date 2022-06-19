package co.com.sofka.retoFinal.cliente.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.retoFinal.cliente.identies.ClienteId;
import co.com.sofka.retoFinal.generic.values.Nombre;

public class EditarNombreClienteVIPCommand extends Command {

    private final ClienteId clienteId;
    private final Nombre nombre;

    public EditarNombreClienteVIPCommand(ClienteId clienteId, Nombre nombre) {
        this.clienteId = clienteId;
        this.nombre = nombre;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
