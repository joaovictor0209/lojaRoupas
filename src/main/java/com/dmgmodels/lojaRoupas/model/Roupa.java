package com.dmgmodels.lojaRoupas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "roupa")
@Entity(name = "Roupa")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Roupa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeProduto;
    private String marca;
    @Enumerated(EnumType.STRING)
    private Tamanho tamanho;
    private double preco;
    private int quantidade;

    public Roupa(String nome, String marca, Tamanho tamanho, double preco, int quantidade) {
        this.nomeProduto = nome;
        this.marca = marca;
        this.tamanho = tamanho;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public Roupa(DadosCadastroRoupa dados) {
        this.nomeProduto = dados.nomeProduto();
        this.marca = dados.marca();
        this.tamanho = dados.tamanho();
        this.preco = dados.preco();
        this.quantidade = dados.quantidade();
    }
}
