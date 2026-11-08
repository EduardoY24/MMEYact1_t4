package com.eymm.spring.app1.mmeyact1_t4.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiInfoController {

    @GetMapping("/nombre")
    public String nombre() {
        return "Proyecto de Eduardo Yael Mendoza Martinez";
    }

    @GetMapping("/materias")
    public List<String> materias() {
        return List.of("Programación Web", "Taller de Base de Datos", "Sistemas Programables", "Desarrollo Sustentable", "Taller de Investigacion", "Gestion de Proyectos de Software");
    }

    @GetMapping("/materias/total")
    public int totalMaterias() {
        return materias().size();
    }
}