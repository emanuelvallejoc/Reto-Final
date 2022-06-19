package co.com.sofka.retoFinal.producto.identities;

import co.com.sofka.domain.generic.Identity;

public class DetalleId extends Identity {

    public DetalleId(String id) {
        super(id);
    }

    public DetalleId() {
    }

    public static DetalleId of(String id){
        return new DetalleId(id);
    }
}
