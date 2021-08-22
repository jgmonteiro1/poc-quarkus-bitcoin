package com.jgmonteiro.entities;

import com.jgmonteiro.entities.dto.Trades;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Histórico de negociações realizadas.
 */
@Data
public class Trade {
    private List<Trades> trades = new ArrayList<>();
}
