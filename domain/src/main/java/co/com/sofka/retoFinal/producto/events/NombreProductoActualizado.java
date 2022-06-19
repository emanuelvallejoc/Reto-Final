package co.com.sofka.retoFinal.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.generic.values.Nombre;
import co.com.sofka.retoFinal.producto.identities.ProductoId;

public class NombreProductoActualizado extends DomainEvent {

    private final ProductoId productoId;
    private final Nombre nombre;

    public NombreProductoActualizado(ProductoId productoId, Nombre nombre) {
        super("producto.NombreProductoActualizado");
        this.productoId = productoId;
        this.nombre = nombre;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
