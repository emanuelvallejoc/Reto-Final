package co.com.sofka.retoFinal.producto;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.retoFinal.producto.commands.EditarPrecioUnitarioProductoCommand;

public class EditarPrecioUnitarioProductoUseCase extends UseCase<RequestCommand<EditarPrecioUnitarioProductoCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<EditarPrecioUnitarioProductoCommand> input) {

        var command = input.getCommand();

        var producto = Producto.from(command.getProductoId(), repository().getEventsBy(command.getProductoId().value()));

        producto.editarPrecioUnitario(command.getPrecioUnitario());

        emit().onResponse(new ResponseEvents(producto.getUncommittedChanges()));

    }
}
