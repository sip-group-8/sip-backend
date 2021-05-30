package com.ws.sip.sip.models;

import com.ws.sip.sip.utils.Utiles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

import static com.ws.sip.sip.utils.Utiles.*;

public class Grupo implements EntidadInterface<GrupoDTO> {
    private Integer id;
    private String descipcion;
    private ArrayList<EntidadInterface> users;

    public Grupo(Integer id, String descipcion) {
        this.id = id;
        this.descipcion = descipcion;
        this.users = new ArrayList<EntidadInterface>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public ArrayList<UsuarioDTO> getUsers() {
        ArrayList<UsuarioDTO> users = new ArrayList<UsuarioDTO>();
        Iterator iter = users.iterator();
        while (iter.hasNext())
            users.add((UsuarioDTO) iter.next() );
        return users;
    }

    public void setUser(ArrayList<EntidadInterface> user) {
        this.users = user;
    }

    public void addUser(Usuario user){
        this.users.add(user);
    }

    public void removeUser(UsuarioDTO dto){
        this.users.remove(dto);
    }

    public void addPuntos(Integer puntos){

    }

    @Override
    public GrupoDTO toDTO() {
        return new GrupoDTO(this.id, this.descipcion);
    }

    public GrupoDTO toDTOusers() {
        return new GrupoDTO(this.id, this.descipcion, Utiles.arrayToDto(this.users));
    }

}
