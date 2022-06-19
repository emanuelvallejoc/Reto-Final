package co.com.sofka.retoFinal.producto;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.retoFinal.producto.events.*;

public class ProductoChange extends EventChange {

    public ProductoChange(Producto entity) {

        apply((ProductoCreado event)->{
            entity.proveedor=event.getProveedor();
            entity.categoria = event.getCategoria();
            entity.nombre = event.getNombre();
            entity.fechaIngreso = event.getFechaIngreso();
            entity.marca=event.getMarca();
            entity.precioUnitario=event.getPrecioUnitario();
            entity.detalle=event.getDetalle();
        });

        apply((NombreProductoActualizado event)->{
            entity.nombre =event.getNombre();
        });

        apply((MarcaProductoActualizado event)->{
            entity.marca =event.getMarca();
        });



        apply((PrecioUnitarioProductoActualizado event)->{
            entity.precioUnitario = event.getPrecioUnitario();
        });

        apply((CategoriaProductoEditado event)->{
            entity.categoria.editarCategoria(event.getCategoriaId(), event.getDescripcion(), event.getFecha());
        });

        apply((FechaCategoriaEditado event)->{
            entity.categoria.editarFecha(event.getFecha());
        });

        apply((UrlLogoDetalleEditado event)->{
            entity.detalle.editarUrlLogo(event.getUrlLogo());
        });

        apply((DescripcionDetalleEditado event)->{
            entity.detalle.editarDescripcion(event.getDescripcion());
        });
    }
}
