package co.com.sofka.retoFinal.cliente.values;

import co.com.sofka.domain.generic.ValueObject;


public class Password implements ValueObject<String> {

    private final String password;


    public Password(String password) {
        this.password = password;
    }


    @Override
    public String value() {
        return password;
    }
}
