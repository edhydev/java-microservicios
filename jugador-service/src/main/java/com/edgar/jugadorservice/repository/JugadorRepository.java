package com.edgar.jugadorservice.repository;

import com.edgar.jugadorservice.entity.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Integer> {
    List<Jugador> findAllByIdEquipo(Integer idEquipo);
}
