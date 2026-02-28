package com.projectpokemon.pokemonservice.factory.waterPokemon.goldeenFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SeakingFactoryTest {
    private static final String SEAKING = "Seaking";

    SeakingFactory seakingFactory;

    @BeforeEach
    void setUp() {
        seakingFactory = new SeakingFactory();
    }

    @Test
    void supports_seaking() {
        assertEquals(SEAKING, seakingFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, seakingFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, seakingFactory.getEvolutionLevel());
    }
}