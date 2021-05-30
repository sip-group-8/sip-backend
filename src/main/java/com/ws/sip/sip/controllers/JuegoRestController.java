package com.ws.sip.sip.controllers;

import com.ws.sip.sip.models.DTOInterface;
import com.ws.sip.sip.services.JuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/juego")
public class JuegoRestController {
    @Autowired
    JuegoService juegoService;

    @GetMapping
    public ArrayList<DTOInterface> getAllUsuarios()  {
        return juegoService.getAllJuegos();
    }

}
