package co.com.sofka.retoFinal.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.venta.values.NumeroCaja;

public class NumeroCajaEditado extends DomainEvent {

    private final NumeroCaja numeroCaja;

    public NumeroCajaEditado(NumeroCaja numeroCaja) {
        super("venta.NumeroCajaEditado");
        this.numeroCaja = numeroCaja;
    }

    public NumeroCaja getNumeroCaja() {
        return numeroCaja;
    }
}
