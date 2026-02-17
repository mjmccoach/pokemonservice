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
class SlowpokeFactoryTest {
    private static final String SLOWPOKE = "Slowpoke";
    private static final String SLOWBRO = "Slowbro";

    SlowpokeFactory slowpokeFactory;

    @BeforeEach
    void setUp() {
        slowpokeFactory = new SlowpokeFactory();
    }

    @Test
    void supports_slowpoke() {
        assertEquals(SLOWPOKE, slowpokeFactory.supports());
    }

    @Test
    void only_evolves_into_slowbro() {
        assertEquals(SLOWBRO, slowpokeFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_37() {
        assertEquals(37, slowpokeFactory.getEvolutionLevel());
    }
}