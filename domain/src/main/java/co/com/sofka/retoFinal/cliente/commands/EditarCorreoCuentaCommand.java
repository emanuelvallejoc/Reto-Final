package co.com.sofka.retoFinal.cliente.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.retoFinal.cliente.identies.ClienteId;
import co.com.sofka.retoFinal.cliente.values.Email;

public class EditarCorreoCuentaCommand extends Command {

    private final ClienteId clienteId;
    private final Email email;

    public EditarCorreoCuentaCommand(ClienteId clienteId, Email email) {
        this.clienteId = clienteId;
        this.email = email;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Email getEmail() {
        return email;
    }
}
