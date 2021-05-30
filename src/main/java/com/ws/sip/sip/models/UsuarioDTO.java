package com.ws.sip.sip.models;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDTO implements DTOInterface {
    String id;
    String nombre;
    String apellido;
    String mail;
    Rol rol;
    Integer puntos;
    ArrayList<DTOInterface> puntajes;
    GrupoDTO grupo;
    ArrayList<DTOInterface> canjes;

    public UsuarioDTO(){}

    public UsuarioDTO(String nombre, String apellido, String mail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
    }

    public UsuarioDTO(String id, int puntos) {
        this.id = id;
        this.puntos=puntos;
    }


    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public ArrayList<DTOInterface> getPuntajes() {
        return puntajes;
    }

    public void setPuntajes(ArrayList<DTOInterface> puntajes) {
        this.puntajes = puntajes;
    }

    public GrupoDTO getGrupo() {
        return grupo;
    }

    public void setGrupo(GrupoDTO grupo) {
        this.grupo = grupo;
    }

    public ArrayList<DTOInterface> getCanjes() {
        return canjes;
    }

    public void setCanjes(ArrayList<DTOInterface> canjes) {
        this.canjes = canjes;
    }
}
