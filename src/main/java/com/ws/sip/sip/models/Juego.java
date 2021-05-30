package com.ws.sip.sip.models;

import java.util.Date;
import java.util.UUID;

public class Juego implements EntidadInterface<JuegoDTO> {
    private Integer id;
    private String descripcion;
    private Date fechacarga;
    private boolean activo;

    public Juego(){
        this.fechacarga = new Date();
        this.activo=true;
    }

    public Juego(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechacarga = new Date();
        this.activo=true;
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

    @Override
    public JuegoDTO toDTO() {
        return new JuegoDTO(this.id.toString(),this.descripcion,this.fechacarga, this.activo);
    }
}
