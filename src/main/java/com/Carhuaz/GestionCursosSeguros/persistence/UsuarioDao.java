package com.ticona.GestionCursosSeguros.persistence;

import com.ticona.GestionCursosSeguros.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
