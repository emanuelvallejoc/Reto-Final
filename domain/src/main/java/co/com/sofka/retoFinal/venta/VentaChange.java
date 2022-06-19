package co.com.sofka.retoFinal.venta;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.retoFinal.venta.events.*;

import java.util.HashSet;

public class VentaChange extends EventChange {

    public VentaChange(Venta venta) {

        apply((VentaCreado event)->{
            venta.vendedor = event.getVendedor();
            venta.factura = event.getFactura();
            venta.clienteId = event.getClienteId();
            venta.precio = event.getPrecio();
            venta.caja = event.getCaja();
            venta.productoIds = new HashSet<>();
        });

        apply((CajaEditada event)->{
            venta.caja = new Caja(event.getCajaId(),
                                    event.getDireccion(),
                                    event.getNumeroCaja(),
                                    event.getNombre());
        });

        apply((VendedorEditado event)->{
            venta.vendedor = new vendedor(event.getVendedorId(),
                    event.getTipoDocumento(),
                    event.getNumeroDocumento(),
                    event.getNombre()) ;
        });

        apply((ProductoIdAgregado event)->{
            venta.productoIds.add(event.getProductoId());

        });

        apply((NombreVendedorCambiado event)->{
            venta.vendedor.CambiarNombre(event.getNombre());
        });

        apply((NombreCajaEditado event)->{
            venta.caja.editarNombre(event.getNombre());
        });

        apply((NumeroCajaEditado event)->{
            venta.caja.editarNumeroCaja(event.getNumeroCaja());
        });

        apply((DireccionCajaEditado event)->{
            venta.caja.editarDireccion(event.getDireccion());
        });

        apply((FechaFacturaEditado event)->{
            venta.factura.editarFecha(event.getFecha());
        });
    }
}
