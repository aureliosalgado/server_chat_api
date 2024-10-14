package com.tuchat.judc.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tuchat.judc.server.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    // Método para verificar si existe un usuario con el correo dado
    boolean existsByCorreo(String correo);
}
