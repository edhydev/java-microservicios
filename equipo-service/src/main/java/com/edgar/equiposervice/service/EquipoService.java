package com.edgar.equiposervice.service;

import com.edgar.equiposervice.entity.Equipo;
import com.edgar.equiposervice.repository.EquipoRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoService {
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
}
