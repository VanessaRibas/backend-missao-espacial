package com.fiap.ec.missioncontrolapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "alertas")
public class Alerta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String nivel;

    @Column(nullable = false)
    private String mensagem;

    public Alerta() {}

    public Alerta(String nome, String nivel, String mensagem) {
        this.nome = nome;
        this.nivel = nivel;
        this.mensagem = mensagem;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNivel() {
        return nivel;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}