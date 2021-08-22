package com.jgmonteiro;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class BitcoinResourceTest {

    @Test
    public void testStatusCodeEquals200(){
        RestAssured
                .given()
                .get("/cripto/BTC/day-summary/2021/8/21/")
                .then()
                .statusCode(200);
    }

    @Test
    public void testStatusCodeEquals404(){
        RestAssured
                .given()
                .get("/criptox")
                .then()
                .statusCode(404);
    }
}
