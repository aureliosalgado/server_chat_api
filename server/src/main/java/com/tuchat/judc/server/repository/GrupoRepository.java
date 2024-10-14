package com.tuchat.judc.server.repository;

import com.tuchat.judc.server.model.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Integer> {
    // Métodos personalizados pueden ser añadidos aquí
}