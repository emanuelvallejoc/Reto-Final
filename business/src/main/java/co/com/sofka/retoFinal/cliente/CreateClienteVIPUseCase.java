package co.com.sofka.retoFinal.cliente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.retoFinal.cliente.commands.CrearClienteVIPCommand;

public class CreateClienteVIPUseCase extends UseCase<RequestCommand<CrearClienteVIPCommand>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CrearClienteVIPCommand> input) {

        var command = input.getCommand();

        var clienteVIP = new Cliente(command.getEntityId(),command.getCuentaId(),command.getEmail(), command.getPassword(), command.getClienteVIPId(),
                command.getTipoDocumento(), command.getDocumento(), command.getNombre());

        emit().onResponse(new ResponseEvents(clienteVIP.getUncommittedChanges()));

    }
}
