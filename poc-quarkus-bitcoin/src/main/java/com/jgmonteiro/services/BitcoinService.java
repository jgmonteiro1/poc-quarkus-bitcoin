package com.jgmonteiro.services;

import com.jgmonteiro.entities.Trade;
import com.jgmonteiro.entities.dto.TickerDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RegisterRestClient(configKey = "CriptoAtivos")
@Produces(MediaType.APPLICATION_JSON)
public interface BitcoinService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{coin}/ticker")
    TickerDTO getTicker(@PathParam("coin") final String coin);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{coin}/trades")
    List<Trade> getTrades(@PathParam("coin") final String coin);

}
