package com.projects.events;

import com.projects.domain.ItemEstoque;
import com.projects.domain.ItemEvent;

import java.util.List;

public record PedidoEmPreparacaoEvent(
        String pedidoId,
        List<ItemEvent> itens
        ) {
}

