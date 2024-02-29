package com.killer.reservation.catalogo.ubicacion;

import org.springframework.stereotype.Service;

@Service
public class UbicacionService {
    private final UbicacionRepository ubicacionRepository;

    public UbicacionService(UbicacionRepository ubicacionRepository) {
        this.ubicacionRepository = ubicacionRepository;
    }
}
