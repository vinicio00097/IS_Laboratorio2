package com.lab2.estudiantes.estudiantes.services;

import com.lab2.estudiantes.estudiantes.daos.EstudianteRepository;
import com.lab2.estudiantes.estudiantes.models.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {
    private final EstudianteRepository _estudianteRepository;

    @Autowired
    public EstudianteService(EstudianteRepository estudianteRepository) {
        _estudianteRepository = estudianteRepository;
    }

    public List<Estudiante> getAll() {
        return (List<Estudiante>) _estudianteRepository.findAll();
    }

    public Estudiante create(Estudiante client) {
        return _estudianteRepository.save(client);
    }
}
