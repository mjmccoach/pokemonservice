package com.projectpokemon.pokemonservice.factory.groundPokemon.rhyhornFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class RhydonFactoryTest {
    private static final String RHYDON = "Rhydon";

    RhydonFactory rhydonFactory;

    @BeforeEach
    void setUp() {
        rhydonFactory = new RhydonFactory();
    }

    @Test
    void supports_rhydon() {
        assertEquals(RHYDON, rhydonFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, rhydonFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, rhydonFactory.getEvolutionLevel());
    }
}