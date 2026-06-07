package com.fiap.ec.missioncontrolapi.controller;
import com.fiap.ec.missioncontrolapi.model.Alerta;
import com.fiap.ec.missioncontrolapi.model.Sensor;
import com.fiap.ec.missioncontrolapi.service.AlertaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/alertas")
@CrossOrigin
public class AlertaController {

    private final AlertaService service;
    public AlertaController(AlertaService service) {
        this.service = service;
    }
    @PostMapping
    public Alerta criar(@RequestBody Alerta alerta) {
        return service.salvar(alerta);
    }
    @GetMapping
    public List<Alerta> listar() {
        return service.listar();
    }
    @GetMapping("/{id}")
    public Alerta buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
    @PutMapping("/{id}")
    public Alerta atualizar(@PathVariable Long id,
                                        @RequestBody Alerta dispositivo) {
        return service.atualizar(id, dispositivo);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}