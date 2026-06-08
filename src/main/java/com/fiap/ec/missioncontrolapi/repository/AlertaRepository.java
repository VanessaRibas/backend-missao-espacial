package com.fiap.ec.missioncontrolapi.repository;

import com.fiap.ec.missioncontrolapi.model.Alerta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertaRepository extends JpaRepository<Alerta, Long> {
}