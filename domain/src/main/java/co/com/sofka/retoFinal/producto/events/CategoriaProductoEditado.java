package co.com.sofka.retoFinal.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.generic.values.Fecha;
import co.com.sofka.retoFinal.producto.identities.CategoriaId;
import co.com.sofka.retoFinal.producto.values.Descripcion;

public class CategoriaProductoEditado extends DomainEvent {
    private final CategoriaId categoriaId;
    private final Descripcion descripcion;
    private final Fecha fecha;

    public CategoriaProductoEditado(CategoriaId categoriaId, Descripcion descripcion, Fecha fecha) {
        super("producto.CategoriaEditado");
        this.categoriaId = categoriaId;
        this.descripcion = descripcion;
        this.fecha = fecha;
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
