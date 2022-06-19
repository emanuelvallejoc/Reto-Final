package co.com.sofka.retoFinal.cliente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.retoFinal.cliente.commands.CrearClienteFrecuenteCommand;


public class CreateClienteFrecuenteUseCase extends UseCase<RequestCommand<CrearClienteFrecuenteCommand>, ResponseEvents>{
    @Override
    public void executeUseCase(RequestCommand<CrearClienteFrecuenteCommand> input) {
        var command = input.getCommand();
        var clienteFrecuente = new Cliente(command.getEntityId(),command.getCuentaId(),command.getEmail(), command.getPassword(), command.getClienteFrecuenteId(),
                command.getTipoDocumento(), command.getDocumento(), command.getNombre());
        emit().onResponse(new ResponseEvents(clienteFrecuente.getUncommittedChanges()));

    }
}
