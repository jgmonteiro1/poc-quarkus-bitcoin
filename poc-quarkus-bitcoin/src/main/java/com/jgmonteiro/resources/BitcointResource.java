package com.jgmonteiro.resources;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.jgmonteiro.entities.Trade;
import com.jgmonteiro.entities.dto.TickerDTO;
import com.jgmonteiro.services.BitcoinService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

@Path("/cripto")
public class BitcointResource {

    @Inject
    @RestClient
    BitcoinService bitcoinService;

    @GET
    @Path("/{coin}/ticker")
    public TickerDTO getTicker(@PathParam("coin")final String coin){
        TickerDTO tickerResponse = bitcoinService.getTicker(coin);
        return tickerResponse;
    }

    @GET
    @Path("/{coin}/trades")
    public List<Trade> getTrades(@PathParam("coin")final String coin) {
        final List<Trade> trades = bitcoinService.getTrades(coin);
        return trades;
    }
}
