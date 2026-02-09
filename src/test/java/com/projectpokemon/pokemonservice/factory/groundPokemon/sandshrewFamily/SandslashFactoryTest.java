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
class SandslashFactoryTest {
    private static final String SANDSLASH = "Sandslash";

    SandslashFactory sandslashFactory;

    @BeforeEach
    void setUp() {
        sandslashFactory = new SandslashFactory();
    }

    @Test
    void supports_sandslash() {
        assertEquals(SANDSLASH, sandslashFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, sandslashFactory.validEvolutions().size());
    }

    @Test
    void has_no_evolution_level() {
        assertEquals(0, sandslashFactory.getEvolutionLevel());
    }
}