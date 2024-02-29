package com.killer.reservation.catalogo.peluqueria;

import org.springframework.stereotype.Service;

@Service
public class PeluqueriaService {
    private final PeluqueriaRepository peluqueriaRepository;

    public PeluqueriaService(PeluqueriaRepository peluqueriaRepository) {
        this.peluqueriaRepository = peluqueriaRepository;
    }

}
