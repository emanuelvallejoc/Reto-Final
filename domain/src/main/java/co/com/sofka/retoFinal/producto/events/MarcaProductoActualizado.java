package co.com.sofka.retoFinal.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.producto.values.Marca;

public class MarcaProductoActualizado extends DomainEvent {

    private final Marca marca;

    public MarcaProductoActualizado(Marca marca) {
        super("producto.NombreMarcaActualizado");
        this.marca = marca;
    }

    public Marca getMarca() {
        return marca;
    }
}
