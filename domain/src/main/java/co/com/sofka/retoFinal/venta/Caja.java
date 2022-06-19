package co.com.sofka.retoFinal.venta;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.retoFinal.generic.values.Nombre;
import co.com.sofka.retoFinal.venta.identities.CajaId;
import co.com.sofka.retoFinal.venta.values.Direccion;
import co.com.sofka.retoFinal.venta.values.NumeroCaja;

public class Caja extends Entity<CajaId> {

    protected Direccion direccion;
    protected NumeroCaja numeroCaja;
    protected Nombre nombre;

    public Caja(CajaId entityId) {
        super(entityId);
    }

    public Caja(CajaId entityId, Direccion direccion, NumeroCaja numeroCaja, Nombre nombre) {
        super(entityId);
        this.direccion = direccion;
        this.numeroCaja = numeroCaja;
        this.nombre = nombre;
    }

    public String direccion() {
        return direccion.value();
    }

    public String numeroCaja() {
        return numeroCaja.value();
    }

    public String nombre() {
        return nombre.value();
    }

    public void editarNombre(Nombre nombre){
        this.nombre = nombre;
    }

    public void editarNumeroCaja(NumeroCaja numeroCaja){
        this.numeroCaja = numeroCaja;
    }

    public void editarDireccion(Direccion direccion){
        this.direccion = direccion;
    }
}
