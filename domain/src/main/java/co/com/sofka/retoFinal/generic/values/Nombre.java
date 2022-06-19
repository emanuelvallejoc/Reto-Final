package co.com.sofka.retoFinal.generic.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre  implements ValueObject<String> {


    private final String nombre;

    public Nombre(String nombre) {
        this.nombre = Objects.requireNonNull(nombre, "Nombre es obligatorio");
    }

    @Override
    public String value() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nombre)) return false;
        Nombre nombre1 = (Nombre) o;
        return Objects.equals(nombre, nombre1.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
