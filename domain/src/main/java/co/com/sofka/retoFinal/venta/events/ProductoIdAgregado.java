package co.com.sofka.retoFinal.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.producto.identities.ProductoId;

public class ProductoIdAgregado  extends DomainEvent {
    private final ProductoId productoId;

    public ProductoIdAgregado(ProductoId productoId) {
        super("venta.ProductoIdAgregado");
        this.productoId = productoId;
    }

    public ProductoId getProductoId() {
        return productoId;
    }
}
