package com.lab2.estudiantes.estudiantes.daos;

import com.lab2.estudiantes.estudiantes.models.Estudiante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends CrudRepository<Estudiante, Long> {
}
