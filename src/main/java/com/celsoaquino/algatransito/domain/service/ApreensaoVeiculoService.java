package com.celsoaquino.algatransito.domain.service;

import com.celsoaquino.algatransito.domain.model.StatusVeiculo;
import com.celsoaquino.algatransito.domain.model.Veiculo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class ApreensaoVeiculoService {

    private final RegistroVeiculoService registroVeiculoService;

    @Transactional
    public void apreender(Long veiculoId) {
        Veiculo veiculo = registroVeiculoService.buscar(veiculoId);
        veiculo.apreender();
    }

    @Transactional
    public void removerApreensao(Long veiculoId) {
        Veiculo veiculo = registroVeiculoService.buscar(veiculoId);
        veiculo.removerApreensao();
    }
}