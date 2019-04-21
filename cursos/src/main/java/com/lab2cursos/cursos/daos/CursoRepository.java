package com.lab2cursos.cursos.daos;

import com.lab2cursos.cursos.Model.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends CrudRepository<Curso, Long> {
}
