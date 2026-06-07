package com.fiap.ec.missioncontrolapi.controller;

import com.fiap.ec.missioncontrolapi.model.DispositivoEspacial;
import com.fiap.ec.missioncontrolapi.service.DispositivoEspacialService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dispositivos")
@CrossOrigin
public class DispositivoEspacialController {

    private final DispositivoEspacialService service;

    public DispositivoEspacialController(DispositivoEspacialService service) {
        this.service = service;
    }

    @PostMapping
    public DispositivoEspacial criar(@RequestBody DispositivoEspacial dispositivo) {
        return service.salvar(dispositivo);
    }

    @GetMapping
    public List<DispositivoEspacial> listar() {
        return service.listar();
    }
    @GetMapping("/{id}")
    public DispositivoEspacial buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
    @PutMapping("/{id}")
    public DispositivoEspacial atualizar(@PathVariable Long id,
                                        @RequestBody DispositivoEspacial dispositivo) {
        return service.atualizar(id, dispositivo);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
}
}