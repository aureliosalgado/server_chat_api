package com.tuchat.judc.server.repository;

import com.tuchat.judc.server.model.MiembrosGrupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiembrosGrupoRepository extends JpaRepository<MiembrosGrupo, Integer> {
    // Métodos personalizados pueden ser añadidos aquí
}