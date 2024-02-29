package com.killer.reservation.catalogo.peluqueria;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/peluqueria")
public class PeluqueriaController {
    private final PeluqueriaService peluqueriaService;
    public PeluqueriaController(PeluqueriaService peluqueriaService) {
        this.peluqueriaService = peluqueriaService;
    }
}
