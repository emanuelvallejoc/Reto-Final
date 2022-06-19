package co.com.sofka.retoFinal.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PrecioUnitario implements ValueObject<Double> {

    private final Double precio;

    public PrecioUnitario(Double precio) {
        this.precio = precio;
    }

    @Override
    public Double value() {
        return precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PrecioUnitario)) return false;
        PrecioUnitario that = (PrecioUnitario) o;
        return Objects.equals(precio, that.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(precio);
    }
}
