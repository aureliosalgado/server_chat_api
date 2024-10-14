package com.tuchat.judc.server.repository;

import com.tuchat.judc.server.model.MensajeGrupoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeGrupoDataRepository extends JpaRepository<MensajeGrupoData, Integer> {
    // Métodos personalizados pueden ser añadidos aquí
}