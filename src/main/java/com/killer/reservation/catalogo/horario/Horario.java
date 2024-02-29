package com.killer.reservation.catalogo.horario;

import com.killer.reservation.catalogo.peluqueria.Peluqueria;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Horario {
    
    @Id
    private Long id;
    private String fecha;
    private String hora;
    @ManyToOne
    private Peluqueria peluqueria;
}
