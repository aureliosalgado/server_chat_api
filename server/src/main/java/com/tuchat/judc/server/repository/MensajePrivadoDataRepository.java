package com.tuchat.judc.server.repository;

import com.tuchat.judc.server.model.MensajePrivadoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajePrivadoDataRepository extends JpaRepository<MensajePrivadoData, Integer> {
    // Métodos personalizados pueden ser añadidos aquí
}