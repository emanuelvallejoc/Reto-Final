package co.com.sofka.retoFinal.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.producto.identities.ProductoId;
import co.com.sofka.retoFinal.producto.values.UrlLogo;

public class UrlLogoDetalleEditado extends DomainEvent {
    private final ProductoId productoId;
    private final UrlLogo urlLogo;



    public UrlLogoDetalleEditado(ProductoId productoId, UrlLogo urlLogo) {
        super("producto.UrlLogoDetalleEditado");
        this.productoId = productoId;
        this.urlLogo = urlLogo;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public UrlLogo getUrlLogo() {
        return urlLogo;
    }
}
