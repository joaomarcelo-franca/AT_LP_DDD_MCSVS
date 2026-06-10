package com.projects.domain;

import com.projects.domain.enums.Status;
import jakarta.persistence.*;

@Entity
public class ItemEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @Column(name = "produto_id", nullable = false)
    private Long produtoid;

    @Embedded
    private Quantidade quantidade;

}
