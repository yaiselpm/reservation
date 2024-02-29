package com.killer.reservation.catalogo.horario;

import org.springframework.stereotype.Service;

@Service
public class HorarioService {
    private final HorarioRepository horarioRepository;

    public HorarioService(HorarioRepository horarioRepository) {
        this.horarioRepository = horarioRepository;
    }
}
