package com.dio.bankline.banklineapi.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_correntista")
public class Correntista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 20)
    private String cpf;
    @Column(length = 60)
    private String nome;
    @Embedded
    private Conta conta;
    public Integer getId() {
        return id;
    }
    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setId(Integer id) {
        this.id = id;
    }


}
