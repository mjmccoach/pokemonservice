package com.projectpokemon.pokemonservice.factory.poisonPokemon.koffingFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class WeezingFactoryTest {
    private static final String WEEZING = "Weezing";

    WeezingFactory weezingFactory;

    @BeforeEach
    void setUp() {
        weezingFactory = new WeezingFactory();
    }

    @Test
    void supports_weezing() {
        assertEquals(WEEZING, weezingFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, weezingFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, weezingFactory.getEvolutionLevel());
    }
}