package com.ws.sip.sip.models;

import java.util.Date;

public class PuntajeDTO implements DTOInterface {

    Integer id;
    String juego;
    Integer puntos;
    Date fecha;
    boolean canjeado;

    public PuntajeDTO(Integer id, String juego, Integer puntos, Date fecha, boolean canjeado) {
        this.id = id;
        this.juego = juego;
        this.puntos = puntos;
        this.fecha = fecha;
        this.canjeado = canjeado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJuego() {
        return juego;
    }

    public void setJuego(String juego) {
        this.juego = juego;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isCanjeado() {
        return canjeado;
    }

    public void setCanjeado(boolean canjeado) {
        this.canjeado = canjeado;
    }
}
