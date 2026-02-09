package com.projectpokemon.pokemonservice.factory.groundPokemon.sandshrewFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SandshrewFactoryTest {
    private static final String SANDSLASH = "Sandslash";
    private static final String SANDSHREW = "Sandshrew";

    SandshrewFactory sandshrewFactory;

    @BeforeEach
    void setUp() {
        sandshrewFactory = new SandshrewFactory();
    }

    @Test
    void supports_sandshrew() {
        assertEquals(SANDSHREW, sandshrewFactory.supports());
    }

    @Test
    void only_evolves_into_sandslash() {
        assertEquals(SANDSLASH, sandshrewFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_22() {
        assertEquals(22, sandshrewFactory.getEvolutionLevel());
    }
}