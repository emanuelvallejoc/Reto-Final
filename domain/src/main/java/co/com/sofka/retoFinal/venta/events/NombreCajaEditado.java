package co.com.sofka.retoFinal.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.generic.values.Nombre;

public class NombreCajaEditado extends DomainEvent {

    private final Nombre nombre;

    public NombreCajaEditado(Nombre nombre) {
        super("venta.NombreCajaEditado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
