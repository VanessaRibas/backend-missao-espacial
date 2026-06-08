package com.fiap.ec.missioncontrolapi.controller;
import com.fiap.ec.missioncontrolapi.model.DispositivoEspacial;
import com.fiap.ec.missioncontrolapi.model.Sensor;
import com.fiap.ec.missioncontrolapi.service.SensorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sensores")
@CrossOrigin
public class SensorController {

    private final SensorService service;

    public SensorController(SensorService service) {
        this.service = service;
    }

    @PostMapping
    public Sensor criar(@RequestBody Sensor sensor) {
        return service.salvar(sensor);
    }

    @GetMapping
    public List<Sensor> listar() {
        return service.listar();
    }
    @GetMapping("/{id}")
    public Sensor buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
    @PutMapping("/{id}")
    public Sensor atualizar(@PathVariable Long id,
                                        @RequestBody Sensor dispositivo) {
        return service.atualizar(id, dispositivo);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}