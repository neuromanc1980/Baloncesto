package com.example.service;

import com.example.domain.Jugador;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    public void jugadores(){

        Jugador jugador1 = new Jugador();
        jugador1.setNombre("Michael");
        jugador1.setFecha_nac(LocalDate.of(1963, 2, 17));
        jugador1.setAsistencias(300);
        jugador1.setCanastas(500);
        jugador1.setPosicion("Escolta");
        jugador1.setRebotes(250);
        jugadorRepository.save(jugador1);

        Jugador jugador2 = new Jugador();
        jugador2.setNombre("Gasol");
        jugador2.setFecha_nac(LocalDate.of(1980, 6, 23));
        jugador2.setAsistencias(100);
        jugador2.setCanastas(340);
        jugador2.setPosicion("Ala-Pivot");
        jugador2.setRebotes(200);
        jugadorRepository.save(jugador2);

        Jugador jugador3 = new Jugador();
        jugador3.setNombre("Navarro");
        jugador3.setFecha_nac(LocalDate.of(1981, 4, 7));
        jugador3.setAsistencias(150);
        jugador3.setCanastas(300);
        jugador3.setPosicion("Base");
        jugador3.setRebotes(90);
        jugadorRepository.save(jugador3);

        Jugador jugador4 = new Jugador();
        jugador4.setNombre("Chichi");
        jugador4.setFecha_nac(LocalDate.of(1976, 12, 31));
        jugador4.setAsistencias(350);
        jugador4.setCanastas(240);
        jugador4.setPosicion("Base");
        jugador4.setRebotes(60);
        jugadorRepository.save(jugador4);

        Jugador jugador5 = new Jugador();
        jugador5.setNombre("Karim");
        jugador5.setFecha_nac(LocalDate.of(1958, 7, 30));
        jugador5.setAsistencias(120);
        jugador5.setCanastas(480);
        jugador5.setPosicion("Pivot");
        jugador5.setRebotes(290);
        jugadorRepository.save(jugador5);

        System.out.println(jugadorRepository.findOne(2l));
        System.out.println(jugadorRepository.findByName("Michael"));



    }



}
