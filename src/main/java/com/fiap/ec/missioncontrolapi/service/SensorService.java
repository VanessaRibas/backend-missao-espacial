package com.fiap.ec.missioncontrolapi.service;

import com.fiap.ec.missioncontrolapi.model.Alerta;
import com.fiap.ec.missioncontrolapi.model.Sensor;
import com.fiap.ec.missioncontrolapi.repository.SensorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {

    private final SensorRepository repository;

    public SensorService(SensorRepository repository) {
        this.repository = repository;
    }

    public Sensor salvar(Sensor sensor) {
        return repository.save(sensor);
    }

    public List<Sensor> listar() {
        return repository.findAll();
    }
    public Sensor buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alerta não encontrado"));
    }
}