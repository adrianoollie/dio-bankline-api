package com.dio.bankline.banklineapi.controller;

import java.util.List;

import com.dio.bankline.banklineapi.dto.NovoCorrentista;
import com.dio.bankline.banklineapi.model.Correntista;
import com.dio.bankline.banklineapi.repository.CorrentistaRepository;
import com.dio.bankline.banklineapi.service.CorrentistaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/correntistas")

public class CorrentistaController {
    @Autowired
    private CorrentistaRepository repository;

    @Autowired
    private CorrentistaService service;

    @GetMapping
    public List<Correntista>findAll(){
        return repository.findAll();
    }
    @PostMapping
    public void save (@RequestBody NovoCorrentista novoCorrentista) {
        service.save(novoCorrentista);
    }
    
}
