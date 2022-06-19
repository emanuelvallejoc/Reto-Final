package co.com.sofka.retoFinal.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.generic.values.Nombre;

public class NombreVendedorCambiado extends DomainEvent {

    private final Nombre nombre;

    public NombreVendedorCambiado(Nombre nombre) {
        super("venta.NombreVendedorCambiado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
