package com.ws.sip.sip.models;

public abstract class Entidad implements EntidadInterface<RolDTO> {

    private Integer id;

    public Entidad(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
