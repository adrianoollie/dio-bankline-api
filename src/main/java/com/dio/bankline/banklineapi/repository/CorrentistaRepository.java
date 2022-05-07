package com.dio.bankline.banklineapi.repository;

import com.dio.bankline.banklineapi.model.Correntista;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrentistaRepository  extends JpaRepository<Correntista, Integer>{
    
}
