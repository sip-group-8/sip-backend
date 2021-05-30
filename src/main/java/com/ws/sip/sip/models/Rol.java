package com.ws.sip.sip.models;

import com.sun.org.apache.bcel.internal.generic.DADD;

import java.util.Date;

public class Rol  implements EntidadInterface<RolDTO>   {
    private Integer id;
    private String descripcion;

    public Rol(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public RolDTO toDTO() {
        return null;
    }
}
