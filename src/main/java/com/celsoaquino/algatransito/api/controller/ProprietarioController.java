package com.celsoaquino.algatransito.api.controller;

import com.celsoaquino.algatransito.domain.model.Proprietario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProprietarioController {

    @PersistenceContext
    private EntityManager manager;

    @GetMapping("/proprietarios")
    public List<Proprietario> list() {
        return manager.createQuery("from Proprietario", Proprietario.class).getResultList();
    }
}
