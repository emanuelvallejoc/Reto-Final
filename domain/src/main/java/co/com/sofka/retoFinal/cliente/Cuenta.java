package co.com.sofka.retoFinal.cliente;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.retoFinal.cliente.identies.CuentaId;
import co.com.sofka.retoFinal.cliente.values.Email;
import co.com.sofka.retoFinal.cliente.values.Password;

public class Cuenta  extends Entity<CuentaId> {

    protected Email email;
    protected Password password;


    public Cuenta(CuentaId entityId) {
        super(entityId);
    }

    public Cuenta(CuentaId entityId, Email email, Password password) {
        super(entityId);
        this.email = email;
        this.password = password;
    }

    public String email() {
        return email.value();
    }

    public String password() {
        return password.value();
    }

    public void editarCorreo(Email email){
        this.email =email;
    }

    public void editarPassword(Password password){
        this.password = password;
    }
}
