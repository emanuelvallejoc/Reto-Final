package co.com.sofka.retoFinal.producto;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.generic.values.Fecha;
import co.com.sofka.retoFinal.generic.values.Nombre;
import co.com.sofka.retoFinal.producto.events.*;
import co.com.sofka.retoFinal.producto.identities.CategoriaId;
import co.com.sofka.retoFinal.producto.identities.ProductoId;
import co.com.sofka.retoFinal.producto.values.*;

import java.util.List;

public class Producto extends AggregateEvent<ProductoId> {

    protected Proveedor proveedor;
    protected Categoria categoria;
    protected Nombre nombre;
    protected FechaIngreso fechaIngreso;
    protected Marca marca;
    protected PrecioUnitario precioUnitario;

    protected Detalle detalle;

    public Producto(ProductoId entityId) {
        super(entityId);
        subscribe(new ProductoChange(this));
    }

    public Producto(ProductoId entityId, Proveedor proveedor, Categoria categoria, Nombre nombre,
                    FechaIngreso fechaIngreso, Marca marca, PrecioUnitario precioUnitario, Detalle detalle) {
        super(entityId);
        subscribe(new ProductoChange(this));
        appendChange(new ProductoCreado(entityId,proveedor,categoria,nombre, fechaIngreso, marca, precioUnitario, detalle)).apply();
    }

    public static Producto from(ProductoId productoId, List<DomainEvent> events){
        var producto = new Producto(productoId);
        events.forEach(producto::applyEvent);
        return producto;
    }

    public void editarNombre(ProductoId productoId, Nombre nombre){
        appendChange(new NombreProductoActualizado(productoId, nombre)).apply();
    }



    public void editarPrecioUnitario(PrecioUnitario precioUnitario){
        appendChange(new PrecioUnitarioProductoActualizado(precioUnitario)).apply();
    }

    public void editarCategoria(CategoriaId entityId, Descripcion descripcion, Fecha fecha){
        appendChange(new CategoriaProductoEditado(entityId, descripcion, fecha)).apply();
    }


    public void editarUrlLogoDetalle(ProductoId productoId ,UrlLogo urlLogo){
        appendChange(new UrlLogoDetalleEditado(productoId, urlLogo)).apply();

    }

    public void editarDescripcionDetalle(Descripcion descripcion){
        appendChange(new DescripcionDetalleEditado(descripcion)).apply();

    }






}
