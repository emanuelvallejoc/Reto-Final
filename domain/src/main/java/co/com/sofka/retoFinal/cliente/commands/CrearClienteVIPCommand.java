package co.com.sofka.retoFinal.cliente.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.retoFinal.cliente.identies.ClienteId;
import co.com.sofka.retoFinal.cliente.identies.ClienteVIPId;
import co.com.sofka.retoFinal.cliente.identies.CuentaId;
import co.com.sofka.retoFinal.cliente.values.Email;
import co.com.sofka.retoFinal.cliente.values.Password;
import co.com.sofka.retoFinal.generic.values.Nombre;
import co.com.sofka.retoFinal.generic.values.NumeroDocumento;
import co.com.sofka.retoFinal.generic.values.TipoDocumento;

public class CrearClienteVIPCommand  extends Command {

    private final ClienteId entityId;
    private final CuentaId cuentaId;
    private final Email email;
    private final Password password;
    private final ClienteVIPId clienteVIPId;
    private final TipoDocumento tipoDocumento;
    private final NumeroDocumento documento;
    private final Nombre nombre;

    public CrearClienteVIPCommand(ClienteId entityId, CuentaId cuentaId, Email email, Password password,
                                  ClienteVIPId clienteVIPId, TipoDocumento tipoDocumento, NumeroDocumento documento,
                                  Nombre nombre) {
        this.entityId = entityId;
        this.cuentaId = cuentaId;
        this.email = email;
        this.password = password;
        this.clienteVIPId = clienteVIPId;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.nombre = nombre;
    }

    public ClienteId getEntityId() {
        return entityId;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public Email getEmail() {
        return email;
    }

    public Password getPassword() {
        return password;
    }

    public ClienteVIPId getClienteVIPId() {
        return clienteVIPId;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public NumeroDocumento getDocumento() {
        return documento;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
