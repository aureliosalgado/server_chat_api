package com.tuchat.judc.server.repository;

import com.tuchat.judc.server.model.MensajeArchivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeArchivoRepository extends JpaRepository<MensajeArchivo, Integer> {
    // Métodos personalizados pueden ser añadidos aquí
}