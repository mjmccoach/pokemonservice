package com.projectpokemon.pokemonservice.factory.ghostPokemon.gastlyFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class HaunterFactoryTest {
    private static final String HAUNTER = "Haunter";
    private static final String GENGAR = "Gengar";

    HaunterFactory haunterFactory;

    @BeforeEach
    void setUp() {
        haunterFactory = new HaunterFactory();
    }

    @Test
    void supports_haunter() {
        assertEquals(HAUNTER, haunterFactory.supports());
    }

    @Test
    void only_evolves_into_gengar() {
        assertEquals(GENGAR, haunterFactory.validEvolutions().getFirst());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, haunterFactory.getEvolutionLevel());
    }

    @Test
    void evolves_by_trade() {
        assertTrue(haunterFactory.evolvesWithTrade());
    }
}