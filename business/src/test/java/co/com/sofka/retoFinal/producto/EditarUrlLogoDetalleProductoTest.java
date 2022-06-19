package co.com.sofka.retoFinal.producto;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoFinal.generic.values.Nombre;
import co.com.sofka.retoFinal.producto.events.NombreProductoActualizado;
import co.com.sofka.retoFinal.producto.events.ProductoCreado;
import co.com.sofka.retoFinal.producto.events.UrlLogoDetalleEditado;
import co.com.sofka.retoFinal.producto.identities.CategoriaId;
import co.com.sofka.retoFinal.producto.identities.DetalleId;
import co.com.sofka.retoFinal.producto.identities.ProductoId;
import co.com.sofka.retoFinal.producto.identities.ProveedorId;
import co.com.sofka.retoFinal.producto.values.*;
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
class EditarUrlLogoDetalleProductoUseCaseTest {

    @InjectMocks
    EditarUrlLogoDetalleProductoUseCase useCase;

    @Mock
    DomainEventRepository repository;

    @Test
    void editarUrlLogoDetalleProductoTest(){

        var productoId = ProductoId.of("ZZZ");
        var  url =  new UrlLogo("https://youtube.com");


        var event = new UrlLogoDetalleEditado(productoId, url);

        when(repository.getEventsBy("ZZZ")).thenReturn(history());

        useCase.addRepository(repository);

        var eventos = UseCaseHandler.getInstance()
                .setIdentifyExecutor(event.getProductoId().value())
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow()
                .getDomainEvents();


        var productoActualizado = (UrlLogoDetalleEditado)eventos.get(0);


        Assertions.assertEquals("ZZZ", productoActualizado.getProductoId().value());
        Assertions.assertEquals("https://youtube.com", productoActualizado.getUrlLogo().value());
    }

    private List<DomainEvent> history() {

        var entityId = ProductoId.of("315");
        var proveedor = new Proveedor(new ProveedorId("789"), new Descripcion("Ramo"), new Nombre("Ramo"));
        var categoria = new Categoria(new CategoriaId("436"));
        var nombre = new Nombre("Andres");
        var fechaIngreso = new FechaIngreso("12/12/2012");
        var marca = new Marca("FritoLay");
        var precioUnitario = new PrecioUnitario(15000D);
        var detalle = new Detalle(new DetalleId("753"), new UrlLogo("https//:google.com"),new Descripcion("wow"));


        return List.of(
                new ProductoCreado(entityId, proveedor, categoria, nombre, fechaIngreso, marca, precioUnitario, detalle));

    }

}