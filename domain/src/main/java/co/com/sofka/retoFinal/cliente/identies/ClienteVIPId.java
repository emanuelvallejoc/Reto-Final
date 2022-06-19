package co.com.sofka.retoFinal.cliente.identies;

import co.com.sofka.domain.generic.Identity;

public class ClienteVIPId extends Identity {

    public ClienteVIPId(String id) {
        super(id);
    }

    public ClienteVIPId() {
    }

    public static ClienteVIPId of(String id){
        return new ClienteVIPId(id);
    }


}
