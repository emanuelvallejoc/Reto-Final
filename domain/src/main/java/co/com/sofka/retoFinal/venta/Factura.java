package co.com.sofka.retoFinal.venta;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.retoFinal.generic.values.Fecha;
import co.com.sofka.retoFinal.venta.identities.FacturaId;
import co.com.sofka.retoFinal.venta.values.CodigoFactura;

public class Factura extends Entity<FacturaId> {

    protected CodigoFactura codigoFactura;
    protected Fecha fecha;

    public Factura(FacturaId entityId) {
        super(entityId);
    }

    public Factura(FacturaId entityId, CodigoFactura codigoFactura, Fecha fecha) {
        super(entityId);
        this.codigoFactura = codigoFactura;
        this.fecha = fecha;
    }

    public String codigoFactura() {
        return codigoFactura.value();
    }

    public String fecha() {
        return fecha.value();
    }

    public void editarFecha(Fecha fecha){
        this.fecha = fecha;
    }
}
