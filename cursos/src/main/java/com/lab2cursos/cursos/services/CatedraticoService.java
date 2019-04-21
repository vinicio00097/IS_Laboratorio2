package com.lab2cursos.cursos.services;

import com.lab2cursos.cursos.Model.Catedratico;
import com.lab2cursos.cursos.daos.CatedraticoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatedraticoService {
    private final CatedraticoRepository _catedraticoRepository;

    @Autowired
    public CatedraticoService(CatedraticoRepository catedraticoRepository) {
        _catedraticoRepository = catedraticoRepository;
    }

    public List<Catedratico> getAll() {
        return (List<Catedratico>) _catedraticoRepository.findAll();
    }

    public Catedratico create(Catedratico catedratico) {
        return _catedraticoRepository.save(catedratico);
    }
}
