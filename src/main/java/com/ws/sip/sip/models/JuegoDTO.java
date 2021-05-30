package com.ws.sip.sip.models;

import java.util.Date;

public class JuegoDTO  implements DTOInterface {
    String id;
    String descripcion;
    Date fechacarga;
    boolean activo;

    public JuegoDTO(String id, String descripcion, Date fechacarga, boolean activo) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechacarga = fechacarga;
        this.activo = activo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechacarga() {
        return fechacarga;
    }

    public void setFechacarga(Date fechacarga) {
        this.fechacarga = fechacarga;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
