package co.com.sofka.retoFinal.cliente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.retoFinal.cliente.commands.EditarCorreoCuentaCommand;

public class ActualizarCorreoCuentaClienteUseCase extends UseCase<RequestCommand<EditarCorreoCuentaCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<EditarCorreoCuentaCommand> input) {

        var command = input.getCommand();

        var cliente = Cliente.from(command.getClienteId(), repository().getEventsBy(command.getClienteId().value()));

        cliente.editarCorreoCuenta(command.getEmail());

        emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
    }
}
