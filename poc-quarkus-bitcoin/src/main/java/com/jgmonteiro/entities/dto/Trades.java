package com.jgmonteiro.entities.dto;

import lombok.Data;

@Data
public class Trades {

    private Double date;
    private Double price;
    private Integer tid;
    private String type;
}
