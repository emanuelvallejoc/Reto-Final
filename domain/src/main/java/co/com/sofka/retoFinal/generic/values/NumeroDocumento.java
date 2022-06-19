package co.com.sofka.retoFinal.generic.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroDocumento implements ValueObject<String> {

    private final String number;

    public NumeroDocumento(String number) {
        if(number.isBlank() || number.isEmpty()){
            throw new IllegalArgumentException("El numero de documento no puede ser vacio");
        }
        this.number = Objects.requireNonNull(number, "Numero de documento es requerido");
    }

    public static NumeroDocumento of(String number){
        return new NumeroDocumento(number);
    }


    @Override
    public String value() {
        return number;
    }
}
