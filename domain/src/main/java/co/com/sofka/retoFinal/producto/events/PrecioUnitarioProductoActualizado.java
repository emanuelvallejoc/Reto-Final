package co.com.sofka.retoFinal.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.producto.values.PrecioUnitario;

public class PrecioUnitarioProductoActualizado extends DomainEvent {
    private final PrecioUnitario precioUnitario;

    public PrecioUnitarioProductoActualizado(PrecioUnitario precioUnitario) {
        super("producto.PrecioUnitarioProductoActualizado");
        this.precioUnitario = precioUnitario;
    }

    public PrecioUnitario getPrecioUnitario() {
        return precioUnitario;
    }
}
