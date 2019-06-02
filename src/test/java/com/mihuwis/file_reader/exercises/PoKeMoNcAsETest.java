package com.mihuwis.file_reader.exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoKeMoNcAsETest {

    PoKeMoNcAsE poKeMoNcAsE;

    @BeforeEach
    private void createInstance(){
        this.poKeMoNcAsE = new PoKeMoNcAsE();
    }

    @Test
    public void testNoWhiteSpaceStringConversion(){
        String expected = "PoKeMoN";

        assertEquals(expected, poKeMoNcAsE.pokemonize("pokemon"));
    }

}