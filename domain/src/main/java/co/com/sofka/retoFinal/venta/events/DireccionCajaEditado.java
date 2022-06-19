package co.com.sofka.retoFinal.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.venta.values.Direccion;

public class DireccionCajaEditado extends DomainEvent {

    private final Direccion direccion;

    public DireccionCajaEditado( Direccion direccion) {
        super("venta.DireccionCajaEditado");
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
