package com.ws.sip.sip.controllers;

import com.ws.sip.sip.models.*;
import com.ws.sip.sip.utils.Constantes;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.UUID;
import java.util.stream.Collectors;

import static com.ws.sip.sip.utils.Utiles.*;

@Controller
public class ControllerSip<usuarios> {
//    @Autowired
//    CrudT crud;

    private static ControllerSip instancia;
    private ArrayList<EntidadInterface> usuarios;
    private ArrayList<EntidadInterface> premios;
    private ArrayList<EntidadInterface> roles;
    private ArrayList<EntidadInterface> logs;
    private ArrayList<EntidadInterface> juegos;
    private ArrayList<EntidadInterface> grupos;


    public static ControllerSip getInstancia(){
        if (instancia==null) {
            instancia = new ControllerSip();
            instancia.iniciacion();
        }
        return instancia;
    }

    private void iniciacion() {
        this.juegos=new ArrayList<>();
        this.premios=new ArrayList<>();
        this.roles=new ArrayList<>();
        this.logs=new ArrayList<>();
        this.grupos = new ArrayList<>();
        this.usuarios=new ArrayList<>();

        cargarInicio(juegos,premios,roles,logs,grupos,usuarios);

    }


    public UsuarioDTO crearUsuario(UsuarioDTO udto){
        Usuario user = new Usuario();
        Rol rol = this.traerRolById(3);
        Grupo grupo = this.traerGrupoById(0);
        ArrayList<EntidadInterface> puntajes=new ArrayList<>();
        ArrayList<EntidadInterface> canje=new ArrayList<>();
        user.setApellido(udto.getApellido());
        user.setNombre(udto.getNombre());
        user.setMail(udto.getMail());
        user.setPassword("");
        user.setRol(rol);
        user.setGrupo(grupo);
        user.setPuntajes(puntajes);
        user.setCanje(canje);
        user.setId(UUID.randomUUID().toString());
        udto.setId(user.getId());
//        grupo.addUser(user);
        this.usuarios.add(user);
        return udto;

    }

    public ArrayList<DTOInterface> getAllUsuarios()  {
        return arrayToDto(this.usuarios);
    }

    public ArrayList<DTOInterface> getAllJuegos()  {
        return arrayToDto(this.juegos);
    }



    private Rol traerRolById(Integer id)  {
        return (Rol) this.roles.stream().filter(r -> ((Rol) r).getId() == id).collect(Collectors.toList()).get(0);
    }

    private Juego traerJuegoById(Integer id)  {
        return (Juego) this.juegos.stream().filter(r -> ((Juego) r).getId() == id).collect(Collectors.toList()).get(0);
    }


    private Grupo traerGrupoById(Integer id)  {
        return (Grupo) this.grupos.stream().filter(grupo -> ((Grupo) grupo).getId() == id).collect(Collectors.toList()).get(0);
    }

    private Usuario traerUsuarioByid(String id){
        return  (Usuario) this.usuarios.stream().filter(userr -> ((Usuario) userr).getId().equals(id)).collect(Collectors.toList()).get(0);
    }

    private Premio traerPremioById(Integer id)  {
        return (Premio) this.premios.stream().filter(r -> ((Premio) r).getId() == id).collect(Collectors.toList()).get(0);
    }


    public UsuarioDTO traerUsuario(String id)  {
        return  this.traerUsuarioByid(id).toDTO();
    }

    public UsuarioDTO traerUsuarioByMail(String mail)  {
        Usuario user =  (Usuario) this.usuarios.stream().filter(userr -> ((Usuario) userr).getMail().equals(mail)).collect(Collectors.toList()).get(0);
        return  user.toDTO();
    }

    public boolean sumarPuntosByusuario(jsonData json)  {
        Usuario user = traerUsuarioByid(json.getId());
        if(user!=null){
            Juego juego = traerJuegoById(json.getIdjuego());
            Puntaje puntaje = new Puntaje(user,juego,json.getPuntos());
            user.addPuntaje(puntaje);
            return true;
        }
        return  false;
    }

    public PremioDTO crearPremio(PremioDTO premiodto) {
        Premio premio = new Premio();
        premio.setId(Constantes.maxpremio);
        premio.setDescripcion(premiodto.getDescripcion());
        premio.setPuntos(premiodto.getPuntos());
        this.premios.add(premio);
        Constantes.setMaxpremio(Constantes.maxpremio + 1);
        return premio.toDTO();
    }

    public PremioDTO getPremioById(Integer id) {
        return traerPremioById(id).toDTO();
    }

    public ArrayList<DTOInterface> getAllPremios() {
        return arrayToDto(this.premios);
    }

    public boolean canjearpremio(jsonData data) {
        Premio premio = traerPremioById(data.getIdpremio());
        Usuario user = traerUsuarioByid(data.getId());
        if(premio.getPuntos() <= user.getPuntos() && premio.getStock() > 0){
            user.canjearPremio(premio);
            premio.setStock(premio.getStock()-1);
            return true;
        }

        return false;
    }
}
