package co.com.sofka.retoFinal.producto.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.retoFinal.generic.values.Fecha;
import co.com.sofka.retoFinal.producto.identities.CategoriaId;
import co.com.sofka.retoFinal.producto.identities.ProductoId;
import co.com.sofka.retoFinal.producto.values.Descripcion;

public class EditarCategoriaProductoCommand extends Command {

    private final ProductoId productoId;
    private final CategoriaId categoriaId;
    private final Descripcion descripcion;
    private final Fecha fecha;

    public EditarCategoriaProductoCommand(ProductoId productoId, CategoriaId categoriaId, Descripcion descripcion, Fecha fecha) {

        this.productoId = productoId;
        this.categoriaId = categoriaId;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public CategoriaId getCategoriaId() {
        return categoriaId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
