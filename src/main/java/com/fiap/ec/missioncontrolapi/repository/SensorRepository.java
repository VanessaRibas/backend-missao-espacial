package com.fiap.ec.missioncontrolapi.repository;


import com.fiap.ec.missioncontrolapi.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, Long> {
}