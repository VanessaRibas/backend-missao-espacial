package com.fiap.ec.missioncontrolapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "dispositivos_espaciais")
public class DispositivoEspacial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String categoria;

    @Column(nullable = false)
    private String status;

    public DispositivoEspacial() {}

    public DispositivoEspacial(String nome, String categoria, String status) {
        this.nome = nome;
        this.categoria = categoria;
        this.status = status;
    }

    public Long getId() {return id;}
    public String getNome() {return nome;}
    public String getCategoria() {return categoria;}
    public String getStatus() {return status;}
    public void setNome(String nome) {this.nome = nome;}
    public void setCategoria(String categoria) {this.categoria = categoria;}
    public void setStatus(String status) {this.status = status;}
}