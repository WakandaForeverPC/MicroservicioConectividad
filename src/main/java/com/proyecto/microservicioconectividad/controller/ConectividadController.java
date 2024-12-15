package com.proyecto.microservicioconectividad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conectividad")
public class ConectividadController {

    @GetMapping
    public String obtenerConectividad() {
        // Lógica para obtener información de conectividad
        return "Información de conectividad";
    }

    @PostMapping
    public String crearConectividad(@RequestBody String nuevaConectividad) {
        // Lógica para crear nueva información de conectividad
        return "Nueva conectividad creada";
    }
}