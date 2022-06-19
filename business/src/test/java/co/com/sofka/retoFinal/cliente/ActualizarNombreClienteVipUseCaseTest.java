package co.com.sofka.retoFinal.cliente;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.cliente.commands.EditarNombreClienteVIPCommand;
import co.com.sofka.retoFinal.cliente.events.ClienteVIPCreado;
import co.com.sofka.retoFinal.cliente.events.NombreClienteVIPEditado;
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
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ActualizarNombreClienteVipUseCaseTest {

    @InjectMocks
    ActualizarNombreClienteVipUseCase useCase;

    @Mock
    DomainEventRepository repository;

    @Test
    void actualizarNombreClienteVipUseCaseTest(){

        var clienteID = ClienteId.of("456");

        var command = new EditarNombreClienteVIPCommand(clienteID, new Nombre("jorge"));

        when(repository.getEventsBy("456")).thenReturn(history());

        useCase.addRepository(repository);

        var eventos = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getClienteId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var clienteVIP = (NombreClienteVIPEditado) eventos.get(0);

        Assertions.assertEquals("jorge", clienteVIP.getNombre().value());

    }

    private List<DomainEvent> history() {
        var clienteID = ClienteId.of("456");
        var cuentaId = new CuentaId("789");
        var email = new Email("yo@mail.com");
        var password = new Password("123456");
        var vipId = new ClienteVIPId("123");
        var tipoDocumento = new TipoDocumento(TipoDocumento.Types.CEDULA_CIUDADANIA);
        var documento = new NumeroDocumento("7952");
        var nombre = new Nombre("Jorge");

        return List.of(
                new ClienteVIPCreado(clienteID, cuentaId,email,password,vipId,tipoDocumento,documento,nombre));
    }

}