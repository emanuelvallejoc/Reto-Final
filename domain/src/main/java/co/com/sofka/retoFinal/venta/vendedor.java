package co.com.sofka.retoFinal.venta;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.retoFinal.generic.values.Nombre;
import co.com.sofka.retoFinal.generic.values.NumeroDocumento;
import co.com.sofka.retoFinal.generic.values.TipoDocumento;
import co.com.sofka.retoFinal.venta.identities.VendedorId;


public class vendedor extends Entity<VendedorId> {

    protected TipoDocumento tipoDocumento;
    protected NumeroDocumento numeroDocumento;
    protected Nombre nombre;

    public vendedor(VendedorId entityId) {
        super(entityId);
    }

    public vendedor(VendedorId entityId, TipoDocumento tipoDocumento, NumeroDocumento numeroDocumento, Nombre nombre) {
        super(entityId);
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
    }

    public void CambiarNombre(Nombre nombre){
        this.nombre = nombre;
    }

    public TipoDocumento.Types tipoDocumento() {
        return tipoDocumento.value();
    }

    public String numeroDocumento() {
        return numeroDocumento.value();
    }

    public String nombre() {
        return nombre.value();
    }
}
