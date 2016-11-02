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
    List<Jugador> findByNameStartingWith(String nombre);
    List<Jugador> findByCanastas(int canastas);
    List<Jugador> findByAsistencias(int min, int max);
    List<Jugador> findByPosicion(String posicion);
    List<Jugador> findByBornOn(LocalDate fecha_nac);
    List<Jugador> findByGrupoPosicion(String posicion);
    List<Jugador> findByGrupoPosicion2(String posicion);

    //jpql queries

    @Query("SELECT jugador FROM Jugador jugador WHERE jugador.nombre like ?1")
    String findJugadorByName(@Param("nombre") String nombre);

    @Query("SELECT jugador FROM Jugador jugador WHERE jugador.canastas >= :canastas")
    String findJugadorByCanastas(@Param("canastas") int canastas);

    @Query("SELECT jugador FROM Jugador jugador where jugador.canastas between :minCanastas and :maxCanastas")
    List<Jugador> findJugadorByAsistencias(
            @Param("minCanastas") Integer minCanastas,
            @Param("maxCanastas") Integer maxCanastas);

    @Query("SELECT jugador FROM Jugador jugador where jugador.posicion =:posicion")
    List<Jugador> findJugadorByPoisicion(@Param("posicion") String posicion);

    @Query("SELECT jugador FROM Jugador jugador where jugador.fecha_nac < :fecha")
    List<Jugador> findJugadorBornBefore(@Param("fecha") LocalDate fecha);

    //agrupar los jugadores por posicion del campo y devolver para
    // cada grupo la siguiente información: la media de canastas, asistencias y rebotes
    @Query("SELECT jugador.posicion, AVG(jugador.canastas), AVG(jugador.asistencias), " +
            "AVG(jugador.rebotes) " + "FROM Jugador jugador " + "GROUP BY jugador.posicion"
            + "ORDER BY AVG(jugador.canastas) DESC")
    List<Object[]> mediaStatsPorPosicion();

    //lo mismo pero con max, min
    @Query("SELECT jugador.posicion, AVG(jugador.canastas), MAX(jugador.canastas), MIN(jugador.canastas)," +
            "AVG(jugador.asistencias), MAX(jugador.asistencias), MIN(jugador.asistencias)," +
            "AVG(jugador.rebotes), MAX(jugador.rebotes), MIN(jugador.rebotes) "
            + "FROM Jugador jugador " + "GROUP BY jugador.posicion"
            + "ORDER BY AVG(jugador.canastas) DESC")
    List<Object[]> mediaStatsPorPosicion2();




}
