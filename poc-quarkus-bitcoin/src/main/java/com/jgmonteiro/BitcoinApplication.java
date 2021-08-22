package com.jgmonteiro;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class BitcoinApplication {

    public static void main(String[] args) {
        Quarkus.run(args);
    }
}
