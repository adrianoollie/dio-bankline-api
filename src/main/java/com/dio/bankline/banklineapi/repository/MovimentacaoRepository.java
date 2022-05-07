package com.dio.bankline.banklineapi.repository;

import com.dio.bankline.banklineapi.model.Movimentacao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {
    
}
