package com.lab2cursos.cursos.Controller;

import com.lab2cursos.cursos.Model.Curso;
import com.lab2cursos.cursos.services.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    private final CursoService _cursoService;

    public CursoController(CursoService cursoService) {
        _cursoService = cursoService;
    }

    @GetMapping("/buscarTodos")
    private List<Curso> getAll() {
        return _cursoService.getAll();
    }

    @PostMapping("/crear")
    public Curso create(@RequestBody Curso curso) {
        return _cursoService.create(curso);
    }
}
