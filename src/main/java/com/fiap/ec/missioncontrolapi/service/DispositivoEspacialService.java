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

    public DispositivoEspacial buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Dispositivo Espacial não encontrado"));
    }

    public DispositivoEspacial atualizar(Long id, DispositivoEspacial atualizado) {
        DispositivoEspacial existente = buscarPorId(id);

        existente.setNome(atualizado.getNome());
        existente.setCategoria(atualizado.getCategoria());
        existente.setStatus(atualizado.getStatus());

        return repository.save(existente);
    }

    public void deletar(Long id) {
        DispositivoEspacial dispositivo = buscarPorId(id);
        repository.delete(dispositivo);
    }
}