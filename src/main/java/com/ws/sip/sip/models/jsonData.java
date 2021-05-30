package com.ws.sip.sip.models;

public class jsonData {
    String id;
    Integer idl;
    Integer idjuego;
    Integer idgrupo;
    Integer irol;
    Integer puntos;
    Integer idpremio;

    public jsonData() {
    }

    public jsonData(String id, Integer idjuego, Integer puntos) {
        this.id = id;
        this.idjuego=idjuego;
        this.puntos=puntos;
    }

    public jsonData(String id, Integer premio) {
        this.id = id;
        this.idpremio=premio;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIdl() {
        return idl;
    }

    public void setIdl(Integer idl) {
        this.idl = idl;
    }

    public Integer getIdjuego() {
        return idjuego;
    }

    public void setIdjuego(Integer idjuego) {
        this.idjuego = idjuego;
    }

    public Integer getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(Integer idgrupo) {
        this.idgrupo = idgrupo;
    }

    public Integer getIrol() {
        return irol;
    }

    public void setIrol(Integer irol) {
        this.irol = irol;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Integer getIdpremio() {
        return idpremio;
    }

    public void setIdpremio(Integer idpremio) {
        this.idpremio = idpremio;
    }
}
