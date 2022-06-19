package co.com.sofka.retoFinal.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Marca  implements ValueObject<String> {

    private final String marca;

    public Marca(String marca) {
        this.marca = marca;
    }

    @Override
    public String value() {
        return marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Marca)) return false;
        Marca marca1 = (Marca) o;
        return Objects.equals(marca, marca1.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }
}
