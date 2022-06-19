package co.com.sofka.retoFinal.cliente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.retoFinal.cliente.commands.EditarCorreoCuentaCommand;
import co.com.sofka.retoFinal.cliente.commands.EditarPasswordCuentaCommand;

public class ActualizarPasswordCuentaClienteUseCase extends UseCase<RequestCommand<EditarPasswordCuentaCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<EditarPasswordCuentaCommand> input) {

        var command = input.getCommand();

        var cliente = Cliente.from(command.getClienteId(), repository().getEventsBy(command.getClienteId().value()));

        cliente.editarPasswordCuenta(command.getPassword());

        emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
    }
}
