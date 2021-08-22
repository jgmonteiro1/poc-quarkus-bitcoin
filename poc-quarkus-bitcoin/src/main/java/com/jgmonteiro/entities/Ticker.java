package com.jgmonteiro.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Retorna informações com o resumo das últimas 24 horas de negociações.
 */
@Data
public class Ticker {

    private Double high;
    private Double low;
    private Double vol;
    private Double last;
    private Double buy;
    private Double sell;
    private Integer date;
}
