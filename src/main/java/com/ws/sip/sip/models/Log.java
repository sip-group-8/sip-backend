package com.ws.sip.sip.models;

import java.util.Date;

public class Log {
    private Integer id;
    private Usuario usuario;
    private Tipolog tipolog;
    private Date fecha;

    public Log(Integer id, Usuario usuario, Tipolog tipolog, Date fecha) {
        this.id = id;
        this.usuario = usuario;
        this.tipolog = tipolog;
        this.fecha = fecha;
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

    public Tipolog getTipolog() {
        return tipolog;
    }

    public void setTipolog(Tipolog tipolog) {
        this.tipolog = tipolog;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
