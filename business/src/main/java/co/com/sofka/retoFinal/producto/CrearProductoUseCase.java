package co.com.sofka.retoFinal.producto;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.retoFinal.producto.commands.CrearProductoCommand;

public class CrearProductoUseCase extends UseCase<RequestCommand<CrearProductoCommand>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CrearProductoCommand> input) {

        var command = input.getCommand();
        var producto = new Producto(command.getEntityId(), command.getProveedor(), command.getCategoria(),
                command.getNombre(), command.getFechaIngreso(), command.getMarca(), command.getPrecioUnitario(),
                command.getDetalle());

        emit().onResponse(new ResponseEvents(producto.getUncommittedChanges()));

    }
}
