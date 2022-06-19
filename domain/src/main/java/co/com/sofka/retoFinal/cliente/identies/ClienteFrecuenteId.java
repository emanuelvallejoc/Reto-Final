package co.com.sofka.retoFinal.cliente.identies;

import co.com.sofka.domain.generic.Identity;

public class ClienteFrecuenteId extends Identity {

    public ClienteFrecuenteId(String id) {
        super(id);
    }

    public ClienteFrecuenteId() {
    }

    public static ClienteFrecuenteId of(String id){
        return new ClienteFrecuenteId(id);
    }


}
