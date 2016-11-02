package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;    private String nombre;
    private String localidad;    private LocalDate fecha_creacion;


    public Equipo(long id, String nombre, String localidad, LocalDate fecha_creacion) {
        this.id = id;        this.nombre = nombre;
        this.localidad = localidad;        this.fecha_creacion = fecha_creacion;
    }

    public long getId() {        return id;    }

    public void setId(long id) {        this.id = id;    }

    public String getNombre() {        return nombre;    }

    public void setNombre(String nombre) {        this.nombre = nombre;    }

    public String getLocalidad() {        return localidad;    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;    }

    public LocalDate getFecha_creacion() {        return fecha_creacion;    }

    public void setFecha_creacion(LocalDate fecha_creacion) {
        this.fecha_creacion = fecha_creacion;    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", fecha_creacion=" + fecha_creacion +
                '}';
    }
}
