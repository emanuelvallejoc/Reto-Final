package co.com.sofka.retoFinal.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.cliente.identies.ClienteId;
import co.com.sofka.retoFinal.venta.Caja;
import co.com.sofka.retoFinal.venta.Factura;
import co.com.sofka.retoFinal.venta.identities.VentaId;
import co.com.sofka.retoFinal.venta.values.Precio;
import co.com.sofka.retoFinal.venta.vendedor;

public class VentaCreado extends DomainEvent {


    private final VentaId entityId;
    private final ClienteId clienteId;
    private final vendedor vendedor;
    private final Factura factura;
    private final Caja caja;
    private final Precio precio;

    public VentaCreado(VentaId entityId, ClienteId clienteId, vendedor vendedor, Factura factura, Caja caja, Precio precio) {
        super("venta.VentaCreado");

        this.entityId = entityId;
        this.clienteId = clienteId;
        this.vendedor = vendedor;
        this.factura = factura;
        this.caja = caja;
        this.precio = precio;
    }

    public VentaId getEntityId() {
        return entityId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public co.com.sofka.retoFinal.venta.vendedor getVendedor() {
        return vendedor;
    }

    public Factura getFactura() {
        return factura;
    }

    public Caja getCaja() {
        return caja;
    }

    public Precio getPrecio() {
        return precio;
    }
}
