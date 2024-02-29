package com.killer.reservation.catalogo.peluqueria;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Data
@ToString
@Entity
public class Peluqueria {

    @Id
    private Long id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String descripcion;

}
