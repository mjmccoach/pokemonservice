package com.projectpokemon.pokemonservice.factory.rockPokemon.omanyteFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class OmastarFactoryTest {
    private static final String OMASTAR = "Omastar";

    OmastarFactory omastarFactory;

    @BeforeEach
    void setUp() {
        omastarFactory = new OmastarFactory();
    }

    @Test
    void supports_omastar() {
        assertEquals(OMASTAR, omastarFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, omastarFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, omastarFactory.getEvolutionLevel());
    }
}