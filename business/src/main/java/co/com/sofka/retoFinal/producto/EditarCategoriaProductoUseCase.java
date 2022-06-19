package co.com.sofka.retoFinal.producto;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.retoFinal.producto.commands.EditarCategoriaProductoCommand;

public class EditarCategoriaProductoUseCase extends UseCase<RequestCommand<EditarCategoriaProductoCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<EditarCategoriaProductoCommand> input) {

        var command = input.getCommand();

        var producto = Producto.from(command.getProductoId(), repository().getEventsBy(command.getProductoId().value()));

        producto.editarCategoria(command.getCategoriaId(), command.getDescripcion(), command.getFecha());

        emit().onResponse(new ResponseEvents(producto.getUncommittedChanges()));



    }
}
