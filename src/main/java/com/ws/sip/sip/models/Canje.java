package com.ws.sip.sip.models;

import java.util.Date;

public class Canje  implements EntidadInterface<CanjeDTO>{
    private Usuario usuario;
    private Premio premio;
    private Integer puntos;
    private Date fechacanje;
    private boolean recibido;

    public Canje(Usuario usuario, Premio premio, Integer puntos, Date fechacanje) {
        this.usuario = usuario;
        this.premio = premio;
        this.puntos = puntos;
        this.fechacanje = fechacanje;
        this.recibido=false;
    }

    public Canje(Usuario usuario, Premio premio, Integer puntos) {
        this.usuario = usuario;
        this.premio = premio;
        this.puntos = puntos;
        this.fechacanje = new Date();
        this.recibido=false;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Premio getPremio() {
        return premio;
    }

    public void setPremio(Premio premio) {
        this.premio = premio;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Date getFechacanje() {
        return fechacanje;
    }

    public void setFechacanje(Date fechacanje) {
        this.fechacanje = fechacanje;
    }

    public boolean isRecibido() {
        return recibido;
    }

    public void setRecibido(boolean recibido) {
        this.recibido = recibido;
    }

    @Override
    public CanjeDTO toDTO() {
        return new CanjeDTO(this.premio.toDTO(),this.puntos,this.fechacanje,this.recibido);
    }
}
