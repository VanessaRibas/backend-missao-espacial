package com.fiap.ec.missioncontrolapi.service;

import com.fiap.ec.missioncontrolapi.model.Alerta;
import com.fiap.ec.missioncontrolapi.repository.AlertaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertaService {

    private final AlertaRepository repository;

    public AlertaService(AlertaRepository repository) {
        this.repository = repository;
    }

    public Alerta salvar(Alerta alerta) {
        return repository.save(alerta);
    }

    public List<Alerta> listar() {
        return repository.findAll();
    }

    public Alerta buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alerta não encontrado"));
    }

    public Alerta atualizar(Long id, Alerta atualizado) {
        Alerta existente = buscarPorId(id);

        existente.setNome(atualizado.getNome());
        existente.setNivel(atualizado.getNivel());
        existente.setMensagem(atualizado.getMensagem());

        return repository.save(existente);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}