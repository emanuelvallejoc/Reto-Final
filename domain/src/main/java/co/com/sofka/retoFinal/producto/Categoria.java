package co.com.sofka.retoFinal.producto;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.retoFinal.generic.values.Fecha;
import co.com.sofka.retoFinal.producto.identities.CategoriaId;
import co.com.sofka.retoFinal.producto.values.Descripcion;

public class Categoria extends Entity<CategoriaId> {

    protected Descripcion descripcion;
    protected Fecha fecha;

    public Categoria(CategoriaId entityId, Descripcion descripcion, Fecha fecha) {
        super(entityId);
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Categoria(CategoriaId entityId) {
        super(entityId);
    }

    public String descripcion() {
        return descripcion.value();
    }

    public String fecha() {
        return fecha.value();
    }

    public void editarCategoria(CategoriaId entityId, Descripcion descripcion, Fecha fecha){
        new Categoria(entityId, descripcion,fecha);
    }

    public void editarFecha(Fecha fecha){
       this.fecha = fecha;
    }
}
