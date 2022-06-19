package co.com.sofka.retoFinal.venta;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.retoFinal.cliente.identies.ClienteId;
import co.com.sofka.retoFinal.generic.values.Fecha;
import co.com.sofka.retoFinal.generic.values.Nombre;
import co.com.sofka.retoFinal.generic.values.NumeroDocumento;
import co.com.sofka.retoFinal.generic.values.TipoDocumento;
import co.com.sofka.retoFinal.producto.identities.ProductoId;
import co.com.sofka.retoFinal.venta.events.*;
import co.com.sofka.retoFinal.venta.identities.CajaId;
import co.com.sofka.retoFinal.venta.identities.VendedorId;
import co.com.sofka.retoFinal.venta.identities.VentaId;
import co.com.sofka.retoFinal.venta.values.Direccion;
import co.com.sofka.retoFinal.venta.values.NumeroCaja;
import co.com.sofka.retoFinal.venta.values.Precio;


import java.util.Set;

public class Venta extends AggregateEvent<VentaId> {

    protected Set<ProductoId> productoIds;
    protected ClienteId clienteId;
    protected vendedor vendedor;
    protected Factura factura;
    protected Caja caja;
    protected Precio precio;

    public Venta(VentaId entityId) {
        super(entityId);
        subscribe(new VentaChange(this));
    }

    public Venta(VentaId entityId, ClienteId clienteId, vendedor vendedor, Factura factura, Caja caja, Precio precio) {
        super(entityId);
        subscribe(new VentaChange(this));
        appendChange(new VentaCreado(entityId, clienteId,vendedor, factura, caja, precio)).apply();
    }

    public void editarCaja(CajaId entityId, Direccion direccion, NumeroCaja numeroCaja, Nombre nombre){
        appendChange(new CajaEditada(entityId, direccion,  numeroCaja,  nombre)).apply();

    }

    public void editarVendedor(VendedorId entityId, TipoDocumento tipoDocumento, NumeroDocumento numeroDocumento, Nombre nombre){
        appendChange(new VendedorEditado(entityId, tipoDocumento,  numeroDocumento,  nombre)).apply();

    }

    public void editarNombreVendedor(Nombre nombre){
        appendChange(new NombreVendedorCambiado(nombre)).apply();
    }

    public void editarNombreCaja(Nombre nombre){
        appendChange(new NombreCajaEditado(nombre)).apply();
    }

    public void editarNumeroCaja(NumeroCaja numeroCaja){
        appendChange(new NumeroCajaEditado(numeroCaja)).apply();
    }

    public void editarFechaFactura(Fecha fecha){
        appendChange(new FechaFacturaEditado(fecha)).apply();
    }

    public void agregarProductoId(ProductoId productoId){
        appendChange(new ProductoIdAgregado(productoId)).apply();
    }
}
