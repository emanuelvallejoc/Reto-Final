package co.com.sofka.retoFinal.producto;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.retoFinal.producto.commands.EditarDescripcionDetalleCommand;

public class EditarDescripcionDetalleUseCase extends UseCase<RequestCommand<EditarDescripcionDetalleCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<EditarDescripcionDetalleCommand> input) {

        var command = input.getCommand();

        var producto = Producto.from(command.getProductoId(),repository().getEventsBy(command.getProductoId().value()));

        producto.editarDescripcionDetalle(command.getDescripcion());

        emit().onResponse(new ResponseEvents(producto.getUncommittedChanges()));

    }
}
