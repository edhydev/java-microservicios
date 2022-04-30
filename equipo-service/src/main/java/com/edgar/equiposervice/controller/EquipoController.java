package com.edgar.equiposervice.controller;

import com.edgar.equiposervice.entity.Equipo;
import com.edgar.equiposervice.model.Jugador;
import com.edgar.equiposervice.service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipo")
public class EquipoController {
    @Autowired
    EquipoService equipoService;

    @GetMapping
    public ResponseEntity<List<Equipo>> listar() {
        return ResponseEntity.ok(equipoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Equipo> buscarPorId(@PathVariable("id") int id) {
        Equipo equipo = equipoService.findById(id);
        return ResponseEntity.ok(equipo);
    }

    @PostMapping
    public ResponseEntity<Equipo> guardar(@RequestBody Equipo equipo) {
        return ResponseEntity.ok(equipoService.save(equipo));
    }

    @GetMapping("/jugadores/{idEquipo}")
    public ResponseEntity<List<Jugador>> getJugadoresPorIdEquipo(@PathVariable int idEquipo) {
        return ResponseEntity.ok(equipoService.getJugadores(idEquipo));
    }
}
