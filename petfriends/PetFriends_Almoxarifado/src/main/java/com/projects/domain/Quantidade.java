package com.projects.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Quantidade {

    @Column(nullable = false)
    private int valor;

    @Column(nullable = false)
    private String unidade;


}
