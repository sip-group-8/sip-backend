package com.ws.sip.sip.models;
import java.util.ArrayList;
import java.util.Iterator;

import static com.ws.sip.sip.utils.Utiles.*;
import static com.ws.sip.sip.utils.Utiles.arrayToDto;

//@Entity
//@Table(name = "Usuario")
public class Usuario implements EntidadInterface<UsuarioDTO> {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(unique = true, nullable = false)
    private String id;

    private String nombre;
    private String apellido;
    private String mail;
    private String password;
    private Rol rol;
    private Grupo grupo;
    private ArrayList<EntidadInterface> puntajes=new ArrayList<>();
    private ArrayList<EntidadInterface> canje=new ArrayList<>();

    public Usuario() {

    }
    public Usuario(String id, String nombre, String apellido, String mail, String password) {
        this.id=id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.password = password;
    }

    public Usuario(String id, String nombre, String apellido, String mail, String password, Rol rol, Grupo grupo, ArrayList<EntidadInterface> puntajes) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.password = password;
        this.rol = rol;
        this.grupo = grupo;
        this.puntajes = puntajes;
    }

    public Usuario(String id, String nombre, String apellido, String mail, String password, Rol rol, Grupo grupo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.password = password;
        this.rol = rol;
        this.grupo = grupo;
    }

    public Usuario(String id, String nombre, String apellido, String mail, String password, Rol rol, Grupo grupo, ArrayList<EntidadInterface> puntajes, ArrayList<EntidadInterface> canje) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.password = password;
        this.rol = rol;
        this.grupo = grupo;
        this.puntajes = puntajes;
        this.canje = canje;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public ArrayList<EntidadInterface> getPuntajes() {
        return puntajes;
    }

    public void setPuntajes(ArrayList<EntidadInterface> puntajes) {
        this.puntajes = puntajes;
    }

    public ArrayList<EntidadInterface> getCanje() {
        return canje;
    }

    public void addPuntaje(Puntaje puntaje){
        this.puntajes.add(puntaje);
    }

    public void setCanje(ArrayList<EntidadInterface> canje) {
        this.canje = canje;
    }

    public void addCanje(Canje canje){
        this.canje.add(canje);
    }

    public Integer getPuntos() {
        Iterator iter = this.puntajes.iterator();
        Integer puntos=0;
        while(iter.hasNext()) {
            Puntaje p = (Puntaje) iter.next();
            if(!p.isCanjeado())
                puntos += p.getPuntos();
        }
        return puntos;
    }

    public void sumarPuntos(Juego juego, Integer puntos){
        Puntaje punto = new Puntaje(this,juego,puntos);
        this.puntajes.add(punto);
    }

    public UsuarioDTO toDTO(){
             ArrayList<EntidadInterface> puntajes;
            UsuarioDTO userdto = new UsuarioDTO(this.getNombre(),this.getApellido(),this.mail);
            userdto.setId(this.getId());
            userdto.setRol(this.rol);
            userdto.setPuntos(this.getPuntos());
            userdto.setPuntajes(arrayToDto(this.puntajes));
            userdto.setGrupo(this.grupo.toDTO());
            userdto.setCanjes(arrayToDto(this.canje));
            return userdto;
    }

    public void canjearPremio(Premio premio) {
        int puntos = premio.getPuntos();
        Iterator iter = this.puntajes.iterator();
        Juego juego=new Juego();
        while (puntos > 0 && iter.hasNext()) {
            Puntaje p = (Puntaje) iter.next();
            p.setCanjeado(true);
            juego=p.getJuego();
            puntos -= p.getPuntos();

        }
        if(puntos < 0 ) {
            Puntaje p = new Puntaje(this,juego,Math.abs(puntos));
            this.addPuntaje(p);
        }
        Canje canje = new Canje(this,premio, premio.getPuntos());
        this.addCanje(canje);
    }
}
