package com.projects.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemEvent {
    private String produtoId;
    private int quantidade;
    private String unidade;
}
