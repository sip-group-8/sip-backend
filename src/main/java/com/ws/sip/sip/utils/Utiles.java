package com.ws.sip.sip.utils;

import com.ws.sip.sip.models.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.stream.Collectors;

public class Utiles {
    public static void cargarInicio(    ArrayList<EntidadInterface> juegos,
                                        ArrayList<EntidadInterface> premios,
                                        ArrayList<EntidadInterface> roles,
                                        ArrayList<EntidadInterface> logs,
                                        ArrayList<EntidadInterface> grupos,
                                        ArrayList<EntidadInterface> usuarios){
        Juego juego = new Juego(1,"Tateti");
        Juego juego2 = new Juego(2,"Ping ball");
        Juego juego3 = new Juego(3,"Jeopardy");
        juegos.add(juego);
        juegos.add(juego2);
        juegos.add(juego3);

        Premio premio = new Premio(1, "Tostadora", 90);
        Premio premio2 = new Premio(2, "Cafetera", 200);
        Premio premio3 = new Premio(3, "Afeitadora", 300);

        premios.add(premio);
        premios.add(premio2);
        premios.add(premio3);

        Constantes.setMaxpremio(4);

        Rol rol = new Rol(1,"Administrador");
        Rol rol2 = new Rol(2,"RRHH");
        Rol rol3 = new Rol(3,"Empleado");
        roles.add(rol);
        roles.add(rol2);
        roles.add(rol3);
        Constantes.setMaxrol(4);

        for(int i=0; i < 12 ; i++)
            grupos.add(new Grupo(i,"Grupo numero " + i));

        Grupo gr = (Grupo) grupos.stream().filter(grupo -> ((Grupo) grupo).getId() == 8).collect(Collectors.toList()).get(0);
        Usuario user = new Usuario(UUID.randomUUID().toString(),
                "Diego Gabriel", "Lopez", "diego9966@gmail.com",
                "diego", rol, gr );
        Constantes.setMaxgrupo(13);

        user.sumarPuntos(juego,80);
        user.sumarPuntos(juego2,20);

        usuarios.add(user);
    }


    public static ArrayList<DTOInterface> arrayToDto(ArrayList<EntidadInterface> t1){
        ArrayList<DTOInterface> t2 = new ArrayList<>();
        if(t1 != null) {
            Iterator iter = t1.iterator();
            while (iter.hasNext())
                t2.add((DTOInterface) ((EntidadInterface) iter.next()).toDTO());
        }
        return t2;
    }








}
