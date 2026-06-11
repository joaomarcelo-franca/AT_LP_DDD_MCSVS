package com.projects.kafka;

import com.projects.events.TransporteEmRotaEvent;
import com.projects.service.TransporteService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TransporteKafkaListener {

    private final TransporteService transporteService;

    @KafkaListener(topics = "transporte-em-rota")
    public void transporteEmRota(TransporteEmRotaEvent event) {
        System.out.println("Evento recebido: " + event);
        transporteService.processarEntrega(event);
    }
}
