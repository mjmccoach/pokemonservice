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
class OddishFactoryTest {
    private static final String ODDISH = "Oddish";
    private static final String GLOOM = "Gloom";

    OddishFactory oddishFactory;

    @BeforeEach
    void setUp() {
        oddishFactory = new OddishFactory();
    }

    @Test
    void supports_oddish() {
        assertEquals(ODDISH, oddishFactory.supports());
    }

    @Test
    void only_evolves_into_gloom() {
        assertEquals(GLOOM, oddishFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_21() {
        assertEquals(21, oddishFactory.getEvolutionLevel());
    }
}