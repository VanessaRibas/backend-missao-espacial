package com.fiap.ec.missioncontrolapi.service;

import com.fiap.ec.missioncontrolapi.model.DispositivoEspacial;
import com.fiap.ec.missioncontrolapi.repository.DispositivoEspacialRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DispositivoEspacialService {

    private final DispositivoEspacialRepository repository;

    public DispositivoEspacialService(DispositivoEspacialRepository repository) {
        this.repository = repository;
    }

    public DispositivoEspacial salvar(DispositivoEspacial dispositivo) {
        return repository.save(dispositivo);
    }

    public List<DispositivoEspacial> listar() {
        return repository.findAll();
    }
}