package com.projectpokemon.pokemonservice.factory.poisonPokemon.nidoranFFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class NidoqueenFactoryTest {
    private static final String NIDOQUEEN = "Nidoqueen";

    NidoqueenFactory nidoqueenFactory;

    @BeforeEach
    void setUp() {
        nidoqueenFactory = new NidoqueenFactory();
    }

    @Test
    void supports_nidoqueen() {
        assertEquals(NIDOQUEEN, nidoqueenFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, nidoqueenFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, nidoqueenFactory.getEvolutionLevel());
    }

    @Test
    void does_not_evolve_by_stone() {
        assertFalse(nidoqueenFactory.evolvesWithStone());
    }
}