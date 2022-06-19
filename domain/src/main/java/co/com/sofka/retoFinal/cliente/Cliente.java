package co.com.sofka.retoFinal.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.cliente.events.*;
import co.com.sofka.retoFinal.cliente.identies.ClienteFrecuenteId;
import co.com.sofka.retoFinal.cliente.identies.ClienteId;
import co.com.sofka.retoFinal.cliente.identies.ClienteVIPId;
import co.com.sofka.retoFinal.cliente.identies.CuentaId;
import co.com.sofka.retoFinal.cliente.values.Email;
import co.com.sofka.retoFinal.cliente.values.Password;
import co.com.sofka.retoFinal.generic.values.Nombre;
import co.com.sofka.retoFinal.generic.values.NumeroDocumento;
import co.com.sofka.retoFinal.generic.values.TipoDocumento;

import java.util.List;

public class Cliente extends AggregateEvent<ClienteId> {

    protected Cuenta cuenta;
    protected ClienteFrecuente clienteFrecuente;
    protected ClienteVIP clienteVIP;

    public Cliente(ClienteId entityId) {
        super(entityId);
        subscribe(new ClienteChange(this));
    }

    public Cliente(ClienteId entityId, CuentaId cuentaId, Email email, Password password, ClienteFrecuenteId clienteFrecuenteId,
                   TipoDocumento tipoDocumento, NumeroDocumento documento, Nombre nombre) {
        super(entityId);
        subscribe(new ClienteChange(this));
        appendChange(new ClienteFrecuenteCreado(entityId, cuentaId, email, password, clienteFrecuenteId,
                tipoDocumento, documento, nombre)).apply();

    }

    public Cliente(ClienteId entityId, CuentaId cuentaId, Email email, Password password, ClienteVIPId clienteVIPId,
                   TipoDocumento tipoDocumento, NumeroDocumento documento, Nombre nombre) {
        super(entityId);
        subscribe(new ClienteChange(this));
        appendChange(new ClienteVIPCreado(entityId, cuentaId, email, password, clienteVIPId,
                tipoDocumento, documento, nombre)).apply();
    }

    public static Cliente from(ClienteId clienteId, List<DomainEvent> events){
        var cliente = new Cliente(clienteId);
        events.forEach(cliente::applyEvent);
        return cliente;
    }

    public void editarCorreoCuenta(Email email){
        appendChange(new CorreoCuentaEditado(email)).apply();
    }

    public void editarPasswordCuenta(Password password){
        appendChange(new PasswordCuentaEditado(password)).apply();
    }

    public void editarNombreClienteFrecuente(Nombre nombre){
        appendChange(new NombreClienteFrecuenteEditado(nombre)).apply();
    }

    public void editarNombreClienteVIP(Nombre nombre){
        appendChange(new NombreClienteVIPEditado(nombre)).apply();
    }
}
