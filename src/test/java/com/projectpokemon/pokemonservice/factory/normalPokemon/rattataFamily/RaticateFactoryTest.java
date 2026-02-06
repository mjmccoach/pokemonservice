package com.projectpokemon.pokemonservice.factory.normalPokemon.rattataFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class RaticateFactoryTest {
    private static final String RATICATE = "Raticate";

    RaticateFactory raticateFactory;

    @BeforeEach
    void setUp() {
        raticateFactory = new RaticateFactory();
    }

    @Test
    void supports_raticate() {
        assertEquals(RATICATE, raticateFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, raticateFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve() {
        assertEquals(0, raticateFactory.getEvolutionLevel());
    }
}