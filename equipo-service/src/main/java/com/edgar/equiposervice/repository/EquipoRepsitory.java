package com.edgar.equiposervice.repository;

import com.edgar.equiposervice.entity.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepsitory extends JpaRepository<Equipo, Integer> {
}
