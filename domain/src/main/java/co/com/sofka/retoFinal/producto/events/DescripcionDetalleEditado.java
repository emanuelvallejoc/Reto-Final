package co.com.sofka.retoFinal.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.producto.values.Descripcion;

public class DescripcionDetalleEditado extends DomainEvent {
    private final Descripcion descripcion;

    public DescripcionDetalleEditado(Descripcion descripcion) {
        super("producto.DescripcionDetalleEditado");
        this.descripcion = descripcion;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
