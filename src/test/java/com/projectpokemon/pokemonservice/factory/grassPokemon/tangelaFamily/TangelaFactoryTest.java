package com.projectpokemon.pokemonservice.factory.grassPokemon.tangelaFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TangelaFactoryTest {
    private static final String TANGELA = "Tangela";

    TangelaFactory tangelaFactory;

    @BeforeEach
    void setUp() {
        tangelaFactory = new TangelaFactory();
    }

    @Test
    void supports_tangela() {
        assertEquals(TANGELA, tangelaFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, tangelaFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, tangelaFactory.getEvolutionLevel());
    }
}