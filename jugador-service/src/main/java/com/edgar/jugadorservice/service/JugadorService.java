package com.edgar.jugadorservice.service;

import com.edgar.jugadorservice.entity.Jugador;
import com.edgar.jugadorservice.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadorService {
    @Autowired
    private JugadorRepository jugadorRepository;

    public List<Jugador> findAll() {
        return jugadorRepository.findAll();
    }

    public Jugador findById(Integer id) {
        return jugadorRepository.findById(id).orElse(null);
    }

    public Jugador save(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    public List<Jugador> findAllByIdEquipo(Integer idEquipo) {
        return jugadorRepository.findAllByIdEquipo(idEquipo);
    }
}
