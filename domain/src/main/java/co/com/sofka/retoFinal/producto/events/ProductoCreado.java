package co.com.sofka.retoFinal.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.generic.values.Nombre;
import co.com.sofka.retoFinal.producto.Categoria;
import co.com.sofka.retoFinal.producto.Detalle;
import co.com.sofka.retoFinal.producto.Proveedor;
import co.com.sofka.retoFinal.producto.identities.ProductoId;
import co.com.sofka.retoFinal.producto.values.FechaIngreso;
import co.com.sofka.retoFinal.producto.values.Marca;
import co.com.sofka.retoFinal.producto.values.PrecioUnitario;

public class ProductoCreado extends DomainEvent {

    private final ProductoId entityId;
    private final Proveedor proveedor;
    private final Categoria categoria;
    private final Nombre nombre;
    private final FechaIngreso fechaIngreso;
    private final Marca marca;
    private final PrecioUnitario precioUnitario;
    private final Detalle detalle;

    public ProductoCreado(ProductoId entityId, Proveedor proveedor, Categoria categoria, Nombre nombre, FechaIngreso
            fechaIngreso, Marca marca, PrecioUnitario precioUnitario, Detalle detalle ) {

        super("producto.ProductoCreado");
        this.entityId = entityId;
        this.proveedor = proveedor;
        this.categoria = categoria;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.marca = marca;
        this.precioUnitario = precioUnitario;
        this.detalle = detalle;
    }

    public ProductoId getEntityId() {
        return entityId;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public FechaIngreso getFechaIngreso() {
        return fechaIngreso;
    }

    public Marca getMarca() {
        return marca;
    }

    public PrecioUnitario getPrecioUnitario() {
        return precioUnitario;
    }

    public Detalle getDetalle() {
        return detalle;
    }
}
