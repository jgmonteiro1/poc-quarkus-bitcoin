package com.jgmonteiro.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Histórico de negociações realizadas.
 */
@Data
public class Trade {
    private Double date;
    private Double price;
    private Integer tid;
    private String type;
}
