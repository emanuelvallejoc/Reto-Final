package co.com.sofka.retoFinal.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.generic.values.Fecha;

public class FechaFacturaEditado extends DomainEvent {
    private final Fecha fecha;

    public FechaFacturaEditado(Fecha fecha) {
        super("venta.FechaFacturaEditado");
        this.fecha = fecha;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
