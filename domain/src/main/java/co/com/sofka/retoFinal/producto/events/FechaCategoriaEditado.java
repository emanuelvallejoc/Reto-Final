package co.com.sofka.retoFinal.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.generic.values.Fecha;

public class FechaCategoriaEditado extends DomainEvent {

    private final Fecha fecha;

    public FechaCategoriaEditado(Fecha fecha) {
        super("producto.FechaCategoriaEditado");
        this.fecha = fecha;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
