package com.example.repository;

import com.example.domain.Equipo;
import com.example.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador, Long>{

    //spring queries
    List<Jugador> findByName(String nombre);
    List<Jugador> findByCanastas(int canastas);
    List<Jugador> findByAsistencias(int asistencias);
    List<Jugador> findByPosicion(String posicion);
    List<Jugador> findByBornBefore(LocalDate fecha_nac);
    List<Jugador> findByGrupoPosicion(String posicion);
    List<Jugador> findByGrupoPosicion2(String posicion);

    //jpql queries

    @Query("SELECT jugador FROM Jugador jugador WHERE jugador.nombre = :nombre")
    String findJugadorByName(@Param("nombre") String nombre);

    @Query("")




}
