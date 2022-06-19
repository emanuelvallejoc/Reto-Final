package co.com.sofka.retoFinal.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.cliente.values.Email;

public class CorreoCuentaEditado extends DomainEvent {
    private final Email email;

    public CorreoCuentaEditado(Email email) {
        super("cliente.CorreoCuentaEditado");

        this.email = email;
    }

    public Email getEmail() {
        return email;
    }
}
