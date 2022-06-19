package co.com.sofka.retoFinal.producto;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.retoFinal.generic.values.Nombre;
import co.com.sofka.retoFinal.producto.commands.CrearProductoCommand;
import co.com.sofka.retoFinal.producto.events.ProductoCreado;
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

@ExtendWith(MockitoExtension.class)
class CrearProductoUseCaseTest {

    @InjectMocks
    CrearProductoUseCase useCase;


    @Test
    void crearProductoUseCaseTest(){
         var entityId = ProductoId.of("315");
         var proveedor = new Proveedor(new ProveedorId("789"), new Descripcion("Ramo"), new Nombre("Ramo"));
         var categoria = new Categoria(new CategoriaId("436"));
         var nombre = new Nombre("Andres");
         var fechaIngreso = new FechaIngreso("12/12/2012");
         var marca = new Marca("FritoLay");
         var precioUnitario = new PrecioUnitario(15000D);
         var detalle = new Detalle(new DetalleId("753"), new UrlLogo("https//:google.com"),new Descripcion("wow"));

         var command = new CrearProductoCommand(entityId, proveedor, categoria,nombre,fechaIngreso,marca,precioUnitario,detalle);

        var eventos = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var producto = (ProductoCreado) eventos.get(0);

        Assertions.assertEquals(entityId, producto.getEntityId());
        Assertions.assertEquals( proveedor, producto.getProveedor());
        Assertions.assertEquals( categoria, producto.getCategoria());



    }

}