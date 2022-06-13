package com.aurora.webgames.service;

import java.util.List;

import com.aurora.webgames.model.CadastroAuroraModel;
import com.aurora.webgames.model.JogoAuroraModel;
import com.aurora.webgames.repository.CategoriasAurora;
import com.aurora.webgames.repository.JogosAurora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public class CategoriasAuroraService {
    
    @Autowired
    private CategoriasAurora repository;

    public List<CadastroAuroraModel> getAllCategorias() {
        return repository.findAll();
    }
}