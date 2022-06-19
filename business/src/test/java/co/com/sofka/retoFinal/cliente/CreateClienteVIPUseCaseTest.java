package co.com.sofka.retoFinal.cliente;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.retoFinal.cliente.commands.CrearClienteFrecuenteCommand;
import co.com.sofka.retoFinal.cliente.commands.CrearClienteVIPCommand;
import co.com.sofka.retoFinal.cliente.events.ClienteFrecuenteCreado;
import co.com.sofka.retoFinal.cliente.events.ClienteVIPCreado;
import co.com.sofka.retoFinal.cliente.identies.ClienteFrecuenteId;
import co.com.sofka.retoFinal.cliente.identies.ClienteId;
import co.com.sofka.retoFinal.cliente.identies.ClienteVIPId;
import co.com.sofka.retoFinal.cliente.identies.CuentaId;
import co.com.sofka.retoFinal.cliente.values.Email;
import co.com.sofka.retoFinal.cliente.values.Password;
import co.com.sofka.retoFinal.generic.values.Nombre;
import co.com.sofka.retoFinal.generic.values.NumeroDocumento;
import co.com.sofka.retoFinal.generic.values.TipoDocumento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;

import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CreateClienteVIPUseCaseTest {

    @InjectMocks
    CreateClienteVIPUseCase useCase;

    @Test
    void createClienteVIPUseCaseTest(){

        var clienteID = ClienteId.of("456");
        var cuentaId = new CuentaId("789");
        var email = new Email("yo@mail.com");
        var password = new Password("123456");
        var freId = new ClienteVIPId("123");
        var tipoDocumento = new TipoDocumento(TipoDocumento.Types.CEDULA_CIUDADANIA);
        var documento = new NumeroDocumento("7952");
        var nombre = new Nombre("Jorge");

        var command = new CrearClienteVIPCommand(clienteID,cuentaId,email,password, freId, tipoDocumento, documento, nombre);

        var eventos = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var clienteVIP = (ClienteVIPCreado)eventos.get(0);

        Assertions.assertEquals("456", clienteVIP.getEntityId().value());
        Assertions.assertEquals("789", clienteVIP.getCuentaId().value());
        Assertions.assertEquals("yo@mail.com", clienteVIP.getEmail().value());
        Assertions.assertEquals("123456", clienteVIP.getPassword().value());
        Assertions.assertEquals("123", clienteVIP.getClienteVIPId().value());
        Assertions.assertEquals(TipoDocumento.Types.CEDULA_CIUDADANIA, clienteVIP.getTipoDocumento().value());
        Assertions.assertEquals("7952", clienteVIP.getDocumento().value());
        Assertions.assertEquals("Jorge", clienteVIP.getNombre().value());




    }

}