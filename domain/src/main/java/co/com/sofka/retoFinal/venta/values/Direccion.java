package co.com.sofka.retoFinal.venta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<String> {

    private final String direccion;

    public Direccion(String direccion) {
        this.direccion = Objects.requireNonNull(direccion, "La direccion es  obligatoria");
    }

    @Override
    public String value() {
        return direccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Direccion)) return false;
        Direccion direccion1 = (Direccion) o;
        return Objects.equals(direccion, direccion1.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccion);
    }
}
