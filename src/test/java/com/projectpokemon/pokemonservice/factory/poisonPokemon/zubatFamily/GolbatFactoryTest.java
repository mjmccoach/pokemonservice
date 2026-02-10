package com.projectpokemon.pokemonservice.factory.poisonPokemon.zubatFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class GolbatFactoryTest {
    private static final String GOLBAT = "Golbat";

    GolbatFactory golbatFactory;

    @BeforeEach
    void setUp() {
        golbatFactory = new GolbatFactory();
    }

    @Test
    void supports_golbat() {
        assertEquals(GOLBAT, golbatFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, golbatFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, golbatFactory.getEvolutionLevel());
    }
}