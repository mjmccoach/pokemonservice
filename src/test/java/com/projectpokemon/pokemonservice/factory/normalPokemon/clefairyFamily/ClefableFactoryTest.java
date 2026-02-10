package com.projectpokemon.pokemonservice.factory.normalPokemon.clefairyFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ClefableFactoryTest {
    private static final String CLEFABLE = "Clefable";

    ClefableFactory clefableFactory;

    @BeforeEach
    void setUp() {
        clefableFactory = new ClefableFactory();
    }

    @Test
    void supports_clefable() {
        assertEquals(CLEFABLE, clefableFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, clefableFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, clefableFactory.getEvolutionLevel());
    }
}