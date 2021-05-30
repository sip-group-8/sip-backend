package com.ws.sip.sip.controllers;

import com.ws.sip.sip.models.DTOInterface;
import com.ws.sip.sip.models.UsuarioDTO;
import com.ws.sip.sip.models.jsonData;
import com.ws.sip.sip.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioRestController {
    @Autowired
    UsuarioService usuarioService;
    
    @GetMapping()
    public ArrayList<DTOInterface> getAllUsuarios()  {
        return usuarioService.getAllUsuarios();
    }

    @GetMapping(path = "/{id}")
    public UsuarioDTO getUsuarioById(@PathVariable("id") String id)  {
        return usuarioService.traerUsuario(id);
    }

    @GetMapping("/mail")
    public UsuarioDTO getUsuarioByMail(@RequestParam("mail") String mail)  {
        return usuarioService.traerUsuariobyMail(mail);
    }

    @PostMapping
    public UsuarioDTO crearUsuario(@RequestBody UsuarioDTO userdto){
        return usuarioService.crearUsuario(userdto);
    }

    @PostMapping("/sumarpuntos")
    public boolean sumarPuntosByusuario(@RequestBody jsonData data){
        return usuarioService.sumarPuntosByusuario(data);
    }
}
