package com.ticona.GestionCursosSeguros.persistence;

import com.ticona.GestionCursosSeguros.entities.Curso;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CursoDao extends CrudRepository<Curso, Long> {
    List<Curso> findAll();
    List<Curso> findByNombreContainingIgnoreCase(String nombre);
}
