package com.edgar.equiposervice.service;

import com.edgar.equiposervice.entity.Equipo;
import com.edgar.equiposervice.model.Jugador;
import com.edgar.equiposervice.repository.EquipoRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EquipoService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EquipoRepsitory equipoRepsitory;

    public List<Equipo> findAll() {
        return equipoRepsitory.findAll();
    }

    public Equipo findById(Integer id) {
        return equipoRepsitory.findById(id).orElse(null);
    }

    public Equipo save(Equipo equipo) {
        return equipoRepsitory.save(equipo);
    }

    public List<Jugador> getJugadores(int idEquipo) {
        return restTemplate.getForObject("http://localhost:8082/jugador/equipo/" + idEquipo, List.class);
    }
}
