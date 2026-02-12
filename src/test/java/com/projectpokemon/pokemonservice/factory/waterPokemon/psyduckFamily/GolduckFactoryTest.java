package com.projectpokemon.pokemonservice.factory.waterPokemon.psyduckFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class GolduckFactoryTest {
    private static final String GOLDUCK = "Golduck";

    GolduckFactory golduckFactory;

    @BeforeEach
    void setUp() {
        golduckFactory = new GolduckFactory();
    }

    @Test
    void supports_golduck() {
        assertEquals(GOLDUCK, golduckFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, golduckFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve() {
        assertEquals(0, golduckFactory.getEvolutionLevel());
    }
}