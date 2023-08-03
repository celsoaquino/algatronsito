package com.celsoaquino.algatransito.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Proprietario {

    private Long id;
    private String name;
    private String email;
    private String phone;
}
