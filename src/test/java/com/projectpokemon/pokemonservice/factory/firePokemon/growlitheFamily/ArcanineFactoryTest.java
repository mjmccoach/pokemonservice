package com.projectpokemon.pokemonservice.factory.firePokemon.growlitheFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ArcanineFactoryTest {
    private static final String ARCANINE = "Arcanine";

    ArcanineFactory arcanineFactory;

    @BeforeEach
    void setUp() {
        arcanineFactory = new ArcanineFactory();
    }

    @Test
    void supports_arcanine() {
        assertEquals(ARCANINE, arcanineFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, arcanineFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, arcanineFactory.getEvolutionLevel());
    }
}