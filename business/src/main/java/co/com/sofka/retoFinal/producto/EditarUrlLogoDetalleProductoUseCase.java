package co.com.sofka.retoFinal.producto;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.retoFinal.producto.events.UrlLogoDetalleEditado;

public class EditarUrlLogoDetalleProductoUseCase extends UseCase<TriggeredEvent<UrlLogoDetalleEditado>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<UrlLogoDetalleEditado> input) {

        var event = input.getDomainEvent();

        var producto = Producto.from(event.getProductoId(), repository().getEventsBy(event.getProductoId().value()));

        producto.editarUrlLogoDetalle(event.getProductoId(), event.getUrlLogo());

        emit().onResponse(new ResponseEvents(producto.getUncommittedChanges()));

    }
}
