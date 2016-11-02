package com.example.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

public class Jugador     {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;    private String nombre;
    private LocalDate fecha_nac;    private int canastas;
    private int asistencias;    private int rebotes;
    private String posicion;

    public Jugador() {
    }

    public Jugador(long id, String nombre, LocalDate fecha_nac, int canastas, int asistencias, int rebotes, String posicion) {
        this.id = id;        this.nombre = nombre;
        this.fecha_nac = fecha_nac;        this.canastas = canastas;
        this.asistencias = asistencias;        this.rebotes = rebotes;
        this.posicion = posicion;
    }

    public long getId() {       return id;   }

    public void setId(long id) {        this.id = id;    }

    public String getNombre() {        return nombre;    }

    public void setNombre(String nombre) {        this.nombre = nombre;    }

    public LocalDate getFecha_nac() {        return fecha_nac;    }

    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;    }

    public int getCanastas() {        return canastas;    }

    public void setCanastas(int canastas) {        this.canastas = canastas;    }

    public int getAsistencias() {        return asistencias;    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;    }

    public int getRebotes() {        return rebotes;    }

    public void setRebotes(int rebotes) {        this.rebotes = rebotes;    }

    public String getPosicion() {        return posicion;    }

    public void setPosicion(String posicion) {        this.posicion = posicion;    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha_nac=" + fecha_nac +
                ", canastas=" + canastas +
                ", asistencias=" + asistencias +
                ", rebotes=" + rebotes +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}
