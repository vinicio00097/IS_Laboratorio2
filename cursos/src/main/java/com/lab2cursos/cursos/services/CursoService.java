package com.lab2cursos.cursos.services;

import com.lab2cursos.cursos.Model.Curso;
import com.lab2cursos.cursos.daos.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    private final CursoRepository _cursoRepository;

    @Autowired
    public CursoService(CursoRepository cursoRepository) {
        _cursoRepository = cursoRepository;
    }

    public List<Curso> getAll() {
        return (List<Curso>) _cursoRepository.findAll();
    }

    public Curso create(Curso client) {
        return _cursoRepository.save(client);
    }
}
