package com.edgar.equiposervice.configuration.feignclient;

import com.edgar.equiposervice.model.Jugador;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "jugador-service", url = "http://localhost:8082")
public interface JugadorFeignClient {
    @PostMapping("/jugador")
    public Jugador save(@RequestBody Jugador jugador);
}
