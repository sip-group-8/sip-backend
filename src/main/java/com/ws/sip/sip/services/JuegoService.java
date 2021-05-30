package com.ws.sip.sip.services;

import com.ws.sip.sip.controllers.ControllerSip;
import com.ws.sip.sip.models.DTOInterface;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JuegoService {

    public ArrayList<DTOInterface> getAllJuegos(){
        return ControllerSip.getInstancia().getAllJuegos();
    }
}
