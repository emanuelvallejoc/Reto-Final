package co.com.sofka.retoFinal.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class UrlLogo implements ValueObject<String> {

    private final String urlLogo;

    public UrlLogo(String descripcion) {
        this.urlLogo = Objects.requireNonNull(descripcion, "UrlLogo es obligatoria");
    }


    @Override
    public String value() {
        return urlLogo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UrlLogo)) return false;
        UrlLogo urlLogo1 = (UrlLogo) o;
        return Objects.equals(urlLogo, urlLogo1.urlLogo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urlLogo);
    }
}
