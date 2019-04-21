package com.lab2cursos.cursos.Controller;

import com.lab2cursos.cursos.Model.Catedratico;
import com.lab2cursos.cursos.services.CatedraticoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catedratico")
public class CatedraticoController {
    private final CatedraticoService _catedraticoService;

    public CatedraticoController(CatedraticoService catedraticoService) {
        _catedraticoService = catedraticoService;
    }

    @GetMapping("/buscarTodos")
    private List<Catedratico> getAll() {
        return _catedraticoService.getAll();
    }

    @PostMapping("/registrar")
    public Catedratico create(@RequestBody Catedratico catedratico) {
        return _catedraticoService.create(catedratico);
    }
}
