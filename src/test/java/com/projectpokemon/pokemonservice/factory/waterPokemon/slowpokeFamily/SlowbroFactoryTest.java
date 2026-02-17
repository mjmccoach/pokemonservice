package com.projectpokemon.pokemonservice.factory.waterPokemon.slowpokeFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SlowbroFactoryTest {
    private static final String SLOWBRO = "Slowbro";

    SlowbroFactory slowbroFactory;

    @BeforeEach
    void setUp() {
        slowbroFactory = new SlowbroFactory();
    }

    @Test
    void supports_slowbro() {
        assertEquals(SLOWBRO, slowbroFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, slowbroFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve() {
        assertEquals(0, slowbroFactory.getEvolutionLevel());
    }

}