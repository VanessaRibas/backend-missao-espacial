package com.fiap.ec.missioncontrolapi.model;
import jakarta.persistence.*;

@Entity
@Table(name = "sensores")
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String tipo;
    private Double valorLeitura;

    public Sensor() {}
    public Sensor(String nome, String tipo, Double valorLeitura) {
        this.nome = nome;
        this.tipo = tipo;
        this.valorLeitura = valorLeitura;
    }

    public Long getId() {return id;}
    public String getNome() { return nome;}
    public String getTipo() {return tipo;}
    public Double getValorLeitura() {return valorLeitura;}
    public void setNome(String nome) {this.nome = nome;}
    public void setTipo(String tipo) {this.tipo = tipo;}
    public void setValorLeitura(Double valorLeitura) {this.valorLeitura = valorLeitura;}
}