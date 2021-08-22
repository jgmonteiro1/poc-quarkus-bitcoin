package com.jgmonteiro.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Retorna resumo diário de negociações realizadas.
 */
@Data
public class DaySummary {

    private String date;
    private Double opening;
    private Double closing;
    private Double lowest;
    private Double highets;
    private Double volume;
    private Double quantity;
    private Integer amout;
    @JsonProperty("avg_price")
    private Double avgPrice;

}
