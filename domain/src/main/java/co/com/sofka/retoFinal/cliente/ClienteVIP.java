package co.com.sofka.retoFinal.cliente;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.retoFinal.cliente.identies.ClienteVIPId;
import co.com.sofka.retoFinal.generic.values.NumeroDocumento;
import co.com.sofka.retoFinal.generic.values.TipoDocumento;
import co.com.sofka.retoFinal.generic.values.Nombre;

public class ClienteVIP extends Entity<ClienteVIPId> {

    protected TipoDocumento tipoDocumento;
    protected NumeroDocumento documento;
    protected Nombre nombre;

    public ClienteVIP(ClienteVIPId entityId) {
        super(entityId);
    }

    public ClienteVIP(ClienteVIPId entityId, TipoDocumento tipoDocumento, NumeroDocumento documento, Nombre nombre) {
        super(entityId);
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.nombre = nombre;
    }

    public TipoDocumento.Types tipoDocumento() {
        return tipoDocumento.value();
    }

    public String documento() {
        return documento.value();
    }

    public String nombre() {
        return nombre.value();
    }

    public void editarNombre(Nombre nombre){
        this.nombre=nombre;
    }
}
