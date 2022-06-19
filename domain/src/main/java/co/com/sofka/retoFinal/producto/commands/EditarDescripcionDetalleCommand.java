package co.com.sofka.retoFinal.producto.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.retoFinal.producto.identities.ProductoId;
import co.com.sofka.retoFinal.producto.values.Descripcion;

public class EditarDescripcionDetalleCommand extends Command {

    private final ProductoId productoId;
    private final Descripcion descripcion;

    public EditarDescripcionDetalleCommand(ProductoId productoId, Descripcion descripcion) {
        this.productoId = productoId;
        this.descripcion = descripcion;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
