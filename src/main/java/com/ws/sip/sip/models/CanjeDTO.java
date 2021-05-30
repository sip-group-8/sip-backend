package com.ws.sip.sip.models;

import java.util.Date;

public class CanjeDTO implements DTOInterface {

    UsuarioDTO usuarioDTO;
    PremioDTO premioDTO;
    Integer puntos;
    Date fechacanje;
    boolean recibido;

    public CanjeDTO(UsuarioDTO usuario, PremioDTO premio, Integer puntos, Date fechacanje, boolean recibido) {
        this.usuarioDTO = usuario;
        this.premioDTO = premio;
        this.puntos = puntos;
        this.fechacanje = fechacanje;
        this.recibido = recibido;
    }

    public CanjeDTO(PremioDTO premio, Integer puntos, Date fechacanje, boolean recibido) {
        this.premioDTO = premio;
        this.puntos = puntos;
        this.fechacanje = fechacanje;
        this.recibido = recibido;
    }

    public UsuarioDTO getUsuarioDTO() {
        return usuarioDTO;
    }

    public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
        this.usuarioDTO = usuarioDTO;
    }

    public PremioDTO getPremioDTO() {
        return premioDTO;
    }

    public void setPremioDTO(PremioDTO premioDTO) {
        this.premioDTO = premioDTO;
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
}
