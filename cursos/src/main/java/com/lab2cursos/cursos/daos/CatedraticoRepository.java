package com.lab2cursos.cursos.daos;

import com.lab2cursos.cursos.Model.Catedratico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatedraticoRepository extends CrudRepository<Catedratico, Long> {
}
