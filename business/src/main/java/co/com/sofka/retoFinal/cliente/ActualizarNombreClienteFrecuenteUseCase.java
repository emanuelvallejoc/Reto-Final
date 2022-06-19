package co.com.sofka.retoFinal.cliente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.retoFinal.cliente.commands.EditarNombreClienteFrecuenteCommand;
import co.com.sofka.retoFinal.cliente.commands.EditarNombreClienteVIPCommand;

public class ActualizarNombreClienteFrecuenteUseCase extends UseCase<RequestCommand<EditarNombreClienteFrecuenteCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<EditarNombreClienteFrecuenteCommand> input) {

        var command = input.getCommand();

        var cliente = Cliente.from(command.getClienteId(), repository().getEventsBy(command.getClienteId().value()));

        cliente.editarNombreClienteFrecuente(command.getNombre());

        emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
    }
}
