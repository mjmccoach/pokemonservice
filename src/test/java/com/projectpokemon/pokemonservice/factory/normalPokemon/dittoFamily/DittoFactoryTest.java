package com.projectpokemon.pokemonservice.factory.normalPokemon.dittoFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class DittoFactoryTest {
    private static final String DITTO = "Ditto";

    DittoFactory dittoFactory;

    @BeforeEach
    void setUp() {
        dittoFactory = new DittoFactory();
    }

    @Test
    void supports_ditto() {
        assertEquals(DITTO, dittoFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, dittoFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, dittoFactory.getEvolutionLevel());
    }
}