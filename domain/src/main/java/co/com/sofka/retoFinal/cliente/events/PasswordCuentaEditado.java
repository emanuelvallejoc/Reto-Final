package co.com.sofka.retoFinal.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.cliente.values.Password;

public class PasswordCuentaEditado extends DomainEvent {
    private final Password password;

    public PasswordCuentaEditado(Password password) {
        super("cliente.PasswordcuentaEditado");
        this.password = password;
    }

    public Password getPassword() {
        return password;
    }
}
