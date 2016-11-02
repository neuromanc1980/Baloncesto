package com.example.repository;

import com.example.domain.Equipo;
import com.example.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by xaviB on 26/10/16.
 */
public interface EquipoRepository extends JpaRepository<Equipo, Long> {

    //spring data queries
    List<Equipo> equiposCiudad(String localidad);
    List<Equipo> jugadoresEquipo(String nombre);
    List<Equipo> jugadoresEquipoPosicion(String nombre, String posicion);
    Jugador maxAnotador (String nombre);



    //jpql queries



}
