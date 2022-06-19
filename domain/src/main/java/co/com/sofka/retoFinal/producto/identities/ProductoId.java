package co.com.sofka.retoFinal.producto.identities;

import co.com.sofka.domain.generic.Identity;

public class ProductoId extends Identity {

    public ProductoId(String id) {
        super(id);
    }

    public ProductoId() {
    }

    public static ProductoId of(String id){
        return new ProductoId(id);
    }
}
