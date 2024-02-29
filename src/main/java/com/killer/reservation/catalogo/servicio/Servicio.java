package com.killer.reservation.catalogo.servicio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
public class Servicio {
    @Id
    private Long id;
    private String nombre;
    private String descripcion;
    private Double precio;
}
