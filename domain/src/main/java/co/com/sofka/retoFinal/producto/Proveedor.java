package co.com.sofka.retoFinal.producto;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.retoFinal.generic.values.Nombre;
import co.com.sofka.retoFinal.producto.identities.ProveedorId;
import co.com.sofka.retoFinal.producto.values.Descripcion;

public class Proveedor extends Entity<ProveedorId> {

    protected Descripcion descripcion;
    protected Nombre nombre;

    public Proveedor(ProveedorId entityId, Descripcion descripcion, Nombre nombre) {
        super(entityId);
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public Proveedor(ProveedorId entityId) {
        super(entityId);
    }

    public String descripcion() {
        return descripcion.value();
    }

    public String nombre() {
        return nombre.value();
    }
}
