package com.projects.domain;

import com.projects.domain.enums.StatusEntrega;
import jakarta.persistence.*;

@Entity
public class Entrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long pedidoid;

    @Embedded
    private Endereco endereco;

    @Column(nullable = false)
    private StatusEntrega status;

    public void registrarSaide(){
        this.status=StatusEntrega.EM_ROTA;
    }

    public void confirmarEntrega(){
        this.status=StatusEntrega.ENTREGUE;
    }

    public void registrarDevolucao(){
        this.status=StatusEntrega.DEVOLVIDO;
    }

}
