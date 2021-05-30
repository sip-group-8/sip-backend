package com.ws.sip.sip.models;

import com.sun.org.apache.bcel.internal.generic.DADD;
import java.util.Date;

public class Premio implements EntidadInterface<PremioDTO> {
    private Integer id;
    private String descripcion;
    private Integer puntos;
    private boolean activo;
    private Integer stock;

    public Premio() {
        this.activo=true;
        this.stock=100;
    }

    public Premio(Integer id, String descripcion, Integer puntos) {
        this.id = id;
        this.descripcion = descripcion;
        this.puntos = puntos;
        this.activo=true;
        this.stock=100;
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

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void restarStock(){
        this.stock-=this.stock;
    }

    @Override
    public PremioDTO toDTO() {
        return new PremioDTO(this.id,this.descripcion,this.puntos,this.activo,this.stock);
    }
}
