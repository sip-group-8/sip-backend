package com.ws.sip.sip.models;

import java.util.Date;

public class Puntaje implements EntidadInterface<PuntajeDTO> {
    private Integer id;
    private Usuario usuario;
    private Juego juego;
    private Integer puntos;
    private Date fecha;
    private boolean canjeado;

    public Puntaje(Integer id, Usuario usuario, Juego juego, Integer puntos, Date fecha) {
        this.id = id;
        this.usuario = usuario;
        this.juego = juego;
        this.puntos = puntos;
        this.fecha = fecha;
        this.canjeado=false;
    }

    public Puntaje(Usuario usuario, Juego juego, Integer puntos) {
        this.usuario = usuario;
        this.juego = juego;
        this.puntos = puntos;
        this.fecha=new Date();
        this.canjeado=false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
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

    @Override
    public PuntajeDTO toDTO(){
        return new PuntajeDTO(this.id,this.juego.getDescripcion(),this.puntos,this.fecha,this.canjeado);
    }


}
