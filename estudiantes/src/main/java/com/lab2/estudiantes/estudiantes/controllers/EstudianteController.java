package com.lab2.estudiantes.estudiantes.controllers;



import com.lab2.estudiantes.estudiantes.models.Estudiante;
import com.lab2.estudiantes.estudiantes.services.EstudianteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    private final EstudianteService _estudianteService;

    public EstudianteController(EstudianteService estudianteService) {
        _estudianteService = estudianteService;
    }

    @GetMapping("/buscarTodos")
    private List<Estudiante> getAll() {
        return _estudianteService.getAll();
    }

    @PostMapping("/registrar")
    public Estudiante create(@RequestBody Estudiante estudiante) {
        return _estudianteService.create(estudiante);
    }
}
