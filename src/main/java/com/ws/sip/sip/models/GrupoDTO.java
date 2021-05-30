package com.ws.sip.sip.models;

import java.util.ArrayList;

public class GrupoDTO implements DTOInterface {

    Integer id;
    String descripcion;
    ArrayList<DTOInterface> users;

    public GrupoDTO(Integer id, String descripcion, ArrayList<DTOInterface> users) {
        this.id = id;
        this.descripcion = descripcion;
        this.users = users;
    }

    public GrupoDTO(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.users = users;
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

    public ArrayList<DTOInterface> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<DTOInterface> users) {
        this.users = users;
    }
}
