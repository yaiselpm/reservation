package com.killer.reservation.catalogo.ubicacion;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Ubicacion {
    @Id
    private Long id;
    private String nombre;
    private String latitud;
    private String longitud;
}
