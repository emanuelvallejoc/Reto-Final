package co.com.sofka.retoFinal.venta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Precio implements ValueObject<Double> {

    private final Double precio;

    public Precio(Double precio) {
        this.precio = precio;
    }

    @Override
    public Double value() {
        return precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Precio)) return false;
        Precio that = (Precio) o;
        return Objects.equals(precio, that.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(precio);
    }
}
