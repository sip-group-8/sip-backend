package com.ws.sip.sip.models;

public class PremioDTO implements DTOInterface {

    Integer id;
    String descripcion;
    Integer puntos;
    boolean activo;
    Integer stock;

    public PremioDTO(){}

    public PremioDTO(String descripcion, Integer puntos) {
        this.descripcion = descripcion;
        this.puntos = puntos;
    }

    public PremioDTO(Integer id, String descripcion, Integer puntos, boolean activo, Integer stock) {
        this.id = id;
        this.descripcion = descripcion;
        this.puntos = puntos;
        this.activo = activo;
        this.stock = stock;
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
}
