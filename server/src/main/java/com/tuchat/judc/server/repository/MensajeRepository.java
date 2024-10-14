package com.tuchat.judc.server.repository;

import com.tuchat.judc.server.model.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MensajeRepository extends JpaRepository<Mensaje, Integer> {
    List<Mensaje> findByUserEmisorId(Integer userId);
    // Otros métodos personalizados pueden ser añadidos aquí
}