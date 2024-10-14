package com.tuchat.judc.server.repository;

import com.tuchat.judc.server.model.UsuarioValidacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioValidacionRepository extends JpaRepository<UsuarioValidacion, Integer> {
    // Métodos personalizados pueden ser añadidos aquí
}