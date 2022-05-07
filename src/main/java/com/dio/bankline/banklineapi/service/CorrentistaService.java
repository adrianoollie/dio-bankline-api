package com.dio.bankline.banklineapi.service;

import java.util.Date;

import com.dio.bankline.banklineapi.dto.NovoCorrentista;
import com.dio.bankline.banklineapi.model.Conta;
import com.dio.bankline.banklineapi.model.Correntista;
import com.dio.bankline.banklineapi.repository.CorrentistaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorrentistaService {
    @Autowired
    private CorrentistaRepository repository;
    public void save (NovoCorrentista novoCorrentista){
        Correntista correntista = new Correntista();
        correntista.setCpf(novoCorrentista.getCpf());
        correntista.setNome(novoCorrentista.getNome());

        Conta conta = new Conta();
        conta.setSaldo(0.0);
        conta.setNumero(new Date().getTime());
        correntista.setConta(conta);
        repository.save(correntista);

    }
}
