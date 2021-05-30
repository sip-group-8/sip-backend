package com.ws.sip.sip.services;

import com.ws.sip.sip.controllers.ControllerSip;
import com.ws.sip.sip.models.DTOInterface;
import com.ws.sip.sip.models.PremioDTO;
import com.ws.sip.sip.models.jsonData;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Service
public class PremioService {

    public ArrayList<DTOInterface> getAllPremios()  {
        return ControllerSip.getInstancia().getAllPremios();
    }

    public PremioDTO crearPremio(@RequestBody PremioDTO premiodto){
        return ControllerSip.getInstancia().crearPremio(premiodto);
    }

    public PremioDTO getPremioById(@PathVariable("id") Integer id)  {
        return ControllerSip.getInstancia().getPremioById(id);
    }

    public boolean canjearpremio(jsonData data) {
        return ControllerSip.getInstancia().canjearpremio(data);
    }
}
