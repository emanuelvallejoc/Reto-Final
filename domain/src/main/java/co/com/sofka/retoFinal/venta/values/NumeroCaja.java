package co.com.sofka.retoFinal.venta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroCaja implements ValueObject<String> {

    private final String numeroCaja;

    public NumeroCaja(String numeroCaja) {
        this.numeroCaja = Objects.requireNonNull(numeroCaja, "La numero Caja es  obligatoria");
    }

    @Override
    public String value() {
        return numeroCaja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NumeroCaja)) return false;
        NumeroCaja numeroCaja1 = (NumeroCaja) o;
        return Objects.equals(numeroCaja, numeroCaja1.numeroCaja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroCaja);
    }
}
