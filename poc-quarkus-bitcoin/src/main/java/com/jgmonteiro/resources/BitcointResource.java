package com.jgmonteiro.resources;

import com.jgmonteiro.entities.dto.TickerDTO;
import com.jgmonteiro.services.BitcoinService;
import org.eclipse.microprofile.rest.client.inject.RestClient;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/cripto")
public class BitcointResource {

    @Inject
    @RestClient
    BitcoinService bitcoinService;

    @GET
    @Path("/{coin}")
    public TickerDTO getTicker(@PathParam("coin")final String coin){
        TickerDTO tickerResponse = bitcoinService.getTicker(coin);
        return tickerResponse;
    }
}
