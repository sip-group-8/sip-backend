package com.ws.sip.sip.services;

import com.ws.sip.sip.controllers.ControllerSip;
import com.ws.sip.sip.models.DTOInterface;
import com.ws.sip.sip.models.Usuario;
import com.ws.sip.sip.models.UsuarioDTO;
import com.ws.sip.sip.models.jsonData;
import com.ws.sip.sip.repositories.CrudT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioService {

    public ArrayList<DTOInterface> getAllUsuarios(){
        return ControllerSip.getInstancia().getAllUsuarios();
    }

    public UsuarioDTO crearUsuario(UsuarioDTO userdto) {
        return ControllerSip.getInstancia().crearUsuario(userdto);
    }

    public UsuarioDTO traerUsuario(String id) {

        return ControllerSip.getInstancia().traerUsuario(id);
    }

    public UsuarioDTO traerUsuariobyMail(String mail) {

        return ControllerSip.getInstancia().traerUsuarioByMail(mail);
    }

    public boolean sumarPuntosByusuario(jsonData data) {

        return ControllerSip.getInstancia().sumarPuntosByusuario(data);
    }



}
