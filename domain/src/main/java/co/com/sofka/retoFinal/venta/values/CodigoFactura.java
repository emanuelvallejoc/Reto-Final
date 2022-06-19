package co.com.sofka.retoFinal.venta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CodigoFactura implements ValueObject<String> {

    private final String codigoFactura;

    public CodigoFactura(String codigoFactura) {
        this.codigoFactura = Objects.requireNonNull(codigoFactura, "El codigo Factura  es  obligatoria");
    }

    @Override
    public String value() {
        return codigoFactura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodigoFactura)) return false;
        CodigoFactura codigoFactura1 = (CodigoFactura) o;
        return Objects.equals(codigoFactura, codigoFactura1.codigoFactura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoFactura);
    }
}
