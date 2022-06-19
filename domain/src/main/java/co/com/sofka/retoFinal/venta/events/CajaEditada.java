package co.com.sofka.retoFinal.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.generic.values.Nombre;
import co.com.sofka.retoFinal.venta.identities.CajaId;
import co.com.sofka.retoFinal.venta.values.Direccion;
import co.com.sofka.retoFinal.venta.values.NumeroCaja;

public class CajaEditada extends DomainEvent {
    private final CajaId cajaId;
    private final Direccion direccion;
    private final NumeroCaja numeroCaja;
    private final Nombre nombre;

    public CajaEditada(CajaId entityId, Direccion direccion, NumeroCaja numeroCaja, Nombre nombre) {
        super("venta.CajaEditada");

        this.cajaId = entityId;
        this.direccion = direccion;
        this.numeroCaja = numeroCaja;
        this.nombre = nombre;
    }

    public CajaId getCajaId() {
        return cajaId;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public NumeroCaja getNumeroCaja() {
        return numeroCaja;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
