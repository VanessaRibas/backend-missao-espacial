package com.fiap.ec.missioncontrolapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "alertas")
public class Alerta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String nivel;

    @Column(nullable = false)
    private String mensagem;

    public Alerta() {}

    public Alerta(String titulo, String nivel, String mensagem) {
        this.titulo = titulo;
        this.nivel = nivel;
        this.mensagem = mensagem;}

    public Long getId() {return id;}
    public String getTitulo() {return titulo;}
    public String getNivel() {return nivel;}
    public String getMensagem() {return mensagem;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setNivel(String nivel) {this.nivel = nivel;}
    public void setMensagem(String mensagem) {this.mensagem = mensagem;}
}