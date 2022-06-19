package co.com.sofka.retoFinal.generic.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Fecha  implements ValueObject<String> {

    private final String fecha;

    public Fecha(String fecha) {
        this.fecha = Objects.requireNonNull(fecha, "La fecha es  obligatoria");
    }

    @Override
    public String value() {
        return fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fecha)) return false;
        Fecha fecha1 = (Fecha) o;
        return Objects.equals(fecha, fecha1.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha);
    }
}
