package co.com.sofka.retoFinal.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.generic.values.Nombre;
import co.com.sofka.retoFinal.generic.values.NumeroDocumento;
import co.com.sofka.retoFinal.generic.values.TipoDocumento;
import co.com.sofka.retoFinal.venta.identities.VendedorId;

public class VendedorEditado extends DomainEvent {
    private final VendedorId vendedorId;
    private final TipoDocumento tipoDocumento;
    private final NumeroDocumento numeroDocumento;
    private final Nombre nombre;

    public VendedorEditado(VendedorId vendedorId, TipoDocumento tipoDocumento, NumeroDocumento numeroDocumento, Nombre nombre) {
        super("venta.VendedorEditado");
        this.vendedorId = vendedorId;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public NumeroDocumento getNumeroDocumento() {
        return numeroDocumento;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
