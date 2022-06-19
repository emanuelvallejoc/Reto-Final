package co.com.sofka.retoFinal.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.generic.values.Nombre;

public class NombreClienteFrecuenteEditado extends DomainEvent {
    private final Nombre nombre;

    public NombreClienteFrecuenteEditado(Nombre nombre) {
        super("cliente.NombreClienteFrecuenteEditado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
