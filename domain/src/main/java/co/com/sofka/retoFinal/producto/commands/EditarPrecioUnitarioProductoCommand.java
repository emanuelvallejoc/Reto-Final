package co.com.sofka.retoFinal.producto.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.retoFinal.producto.identities.ProductoId;
import co.com.sofka.retoFinal.producto.values.PrecioUnitario;

public class EditarPrecioUnitarioProductoCommand  extends Command {

    private final ProductoId productoId;
    private final PrecioUnitario precioUnitario;

    public EditarPrecioUnitarioProductoCommand(ProductoId productoId, PrecioUnitario precioUnitario) {
        this.productoId = productoId;
        this.precioUnitario = precioUnitario;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public PrecioUnitario getPrecioUnitario() {
        return precioUnitario;
    }
}
