package co.com.sofka.retoFinal.producto;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.retoFinal.producto.events.NombreProductoActualizado;

public class EditarNombreProductoUseCase extends UseCase<TriggeredEvent<NombreProductoActualizado>, ResponseEvents> {

    @Override
    public void executeUseCase(TriggeredEvent<NombreProductoActualizado> input) {

        var event = input.getDomainEvent();

        var producto = Producto.from(event.getProductoId(), repository().getEventsBy(event.getProductoId().value()));

        producto.editarNombre(event.getProductoId(), event.getNombre());

        emit().onResponse(new ResponseEvents(producto.getUncommittedChanges()));



    }
}
