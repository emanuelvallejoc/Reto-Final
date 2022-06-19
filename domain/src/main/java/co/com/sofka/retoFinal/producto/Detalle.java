package co.com.sofka.retoFinal.producto;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.retoFinal.producto.identities.DetalleId;
import co.com.sofka.retoFinal.producto.values.Descripcion;
import co.com.sofka.retoFinal.producto.values.UrlLogo;

public class Detalle extends Entity<DetalleId> {

    protected UrlLogo urlLogo;
    protected Descripcion descripcion;

    public Detalle(DetalleId entityId, UrlLogo urlLogo, Descripcion descripcion) {
        super(entityId);
        this.urlLogo = urlLogo;
        this.descripcion = descripcion;
    }

    public Detalle(DetalleId entityId) {
        super(entityId);
    }

    public String urlLogo() {
        return urlLogo.value();
    }

    public String descripcion() {
        return descripcion.value();
    }

    public void editarUrlLogo(UrlLogo urlLogo){
        this.urlLogo = urlLogo;
    }

    public void editarDescripcion(Descripcion descripcion){
        this.descripcion = descripcion;
    }
}
