package co.com.sofka.retoFinal.cliente;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.retoFinal.cliente.events.*;

public class ClienteChange extends EventChange {
    public ClienteChange(Cliente cliente) {

        apply((ClienteFrecuenteCreado event)->{
            cliente.cuenta = new Cuenta(event.getCuentaId(), event.getEmail(), event.getPassword());
            cliente.clienteFrecuente = new ClienteFrecuente(event.getClienteFrecuenteId(), event.getTipoDocumento(), event.getDocumento(), event.getNombre());

        });

        apply((ClienteVIPCreado event)->{
            cliente.cuenta = new Cuenta(event.getCuentaId(), event.getEmail(), event.getPassword());
            cliente.clienteVIP = new ClienteVIP(event.getClienteVIPId(), event.getTipoDocumento(), event.getDocumento(), event.getNombre());
        });

        apply((CorreoCuentaEditado event)->{
            cliente.cuenta.editarCorreo(event.getEmail());
        });

        apply((PasswordCuentaEditado event)->{
            cliente.cuenta.editarPassword(event.getPassword());
        });

        apply((NombreClienteFrecuenteEditado event)->{
            cliente.clienteFrecuente.editarNombre(event.getNombre());
        });

        apply((NombreClienteVIPEditado event)->{
            cliente.clienteVIP.editarNombre(event.getNombre());
        });
    }
}
