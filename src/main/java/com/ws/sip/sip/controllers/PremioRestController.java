package com.ws.sip.sip.controllers;

import com.ws.sip.sip.models.DTOInterface;
import com.ws.sip.sip.models.PremioDTO;
import com.ws.sip.sip.models.jsonData;
import com.ws.sip.sip.services.PremioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/premio")
public class PremioRestController {
    @Autowired
    PremioService premioService;

    @GetMapping()
    public ArrayList<DTOInterface> getAllPremios()  {
        return premioService.getAllPremios();
    }

    @GetMapping(path = "/{id}")
    public PremioDTO getPremioById(@PathVariable("id") Integer id)  {
        return premioService.getPremioById(id);
    }

    @PostMapping
    public PremioDTO crearPremio(@RequestBody PremioDTO premiodto){
        return premioService.crearPremio(premiodto);
    }


    @PostMapping("/canjearpremio")
    public boolean canjearpremio(@RequestBody jsonData data){
        return premioService.canjearpremio(data);
    }




}
