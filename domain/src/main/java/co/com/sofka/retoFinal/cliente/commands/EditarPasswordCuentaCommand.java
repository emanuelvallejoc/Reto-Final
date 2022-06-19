package co.com.sofka.retoFinal.cliente.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.retoFinal.cliente.identies.ClienteId;
import co.com.sofka.retoFinal.cliente.values.Password;

public class EditarPasswordCuentaCommand extends Command {

    private final ClienteId clienteId;
    private final Password password;

    public EditarPasswordCuentaCommand(ClienteId clienteId, Password password) {
        this.clienteId = clienteId;
        this.password = password;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Password getPassword() {
        return password;
    }
}
