package co.com.sofka.retoFinal.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.generic.values.Nombre;

public class NombreClienteVIPEditado extends DomainEvent {
    private final Nombre nombre;

    public NombreClienteVIPEditado(Nombre nombre) {
        super("cliente.NombreClienteVIPEditado");

        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
