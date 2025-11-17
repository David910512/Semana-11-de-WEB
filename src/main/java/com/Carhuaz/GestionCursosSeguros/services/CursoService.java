package com.ticona.GestionCursosSeguros.services;

import com.ticona.GestionCursosSeguros.entities.Curso;
import java.util.List;
import java.util.Optional;

public interface CursoService {
    List<Curso> findAll();
    Optional<Curso> findById(Long id);
    Curso save(Curso curso);
    void deleteById(Long id);
    List<Curso> findByNombre(String nombre);
}
