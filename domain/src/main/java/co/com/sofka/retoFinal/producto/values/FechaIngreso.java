package co.com.sofka.retoFinal.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class FechaIngreso implements ValueObject<String> {

    private final String fechaIngreso;

    public FechaIngreso(String fechaIngreso) {
        this.fechaIngreso = Objects.requireNonNull(fechaIngreso, "La fecha es  obligatoria");
    }

    @Override
    public String value() {
        return fechaIngreso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FechaIngreso)) return false;
        FechaIngreso that = (FechaIngreso) o;
        return Objects.equals(fechaIngreso, that.fechaIngreso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaIngreso);
    }
}
