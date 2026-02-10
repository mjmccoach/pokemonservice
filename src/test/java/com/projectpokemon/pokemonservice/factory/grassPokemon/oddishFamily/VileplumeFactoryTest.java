package com.projectpokemon.pokemonservice.factory.grassPokemon.oddishFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class VileplumeFactoryTest {
    private static final String VILEPLUME = "Vileplume";

    VileplumeFactory vileplumeFactory;

    @BeforeEach
    void setUp() {
        vileplumeFactory = new VileplumeFactory();
    }

    @Test
    void supports_vileplume() {
        assertEquals(VILEPLUME, vileplumeFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, vileplumeFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, vileplumeFactory.getEvolutionLevel());
    }
}