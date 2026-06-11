package com.projects.kafka;

import com.projects.events.PedidoEmPreparacaoEvent;
import com.projects.service.AlmoxarifadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AlmoxarifadoKafkaListener {

    private final AlmoxarifadoService almoxarifadoService;

    @KafkaListener(topics = "pedido-em-preparacao")
    public void receberPedidoEmPreparacao(PedidoEmPreparacaoEvent event){
        System.out.println("Eventos recebido: " + event.toString());
        almoxarifadoService.processarPedidoEmPreparacao(event);
    }
}
