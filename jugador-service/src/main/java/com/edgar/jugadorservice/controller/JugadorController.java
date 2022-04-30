package com.edgar.jugadorservice.controller;

import com.edgar.jugadorservice.entity.Jugador;
import com.edgar.jugadorservice.service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jugador")
public class JugadorController {
    @Autowired
    private JugadorService jugadorService;

    @GetMapping
    public ResponseEntity<List<Jugador>> findAll() {
        return ResponseEntity.ok(jugadorService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Jugador> findById(@PathVariable int id) {
        return ResponseEntity.ok(jugadorService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Jugador> save(@RequestBody Jugador jugador) {
        return ResponseEntity.ok(jugadorService.save(jugador));
    }

    @GetMapping("/equipo/{idEquipo}")
    public ResponseEntity<List<Jugador>> findAllByIdEquipo(@PathVariable int idEquipo) {
        return ResponseEntity.ok(jugadorService.findAllByIdEquipo(idEquipo));
    }
}
