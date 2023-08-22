package com.celsoaquino.algatransito.api.assembler;

import com.celsoaquino.algatransito.api.model.AutuacaoModel;
import com.celsoaquino.algatransito.api.model.input.AutuacaoInput;
import com.celsoaquino.algatransito.domain.model.Autuacao;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class AutuacaoAssembler {

    private final ModelMapper modelMapper;

    public Autuacao toEntity(AutuacaoInput autuacaoInput) {
        return modelMapper.map(autuacaoInput, Autuacao.class);
    }

    public AutuacaoModel toModel(Autuacao autuacao) {
        return modelMapper.map(autuacao, AutuacaoModel.class);
    }

    public List<AutuacaoModel> toCollectionModel(List<Autuacao> autuacaos) {
        return autuacaos.stream()
                .map(this::toModel)
                .toList();
    }
}