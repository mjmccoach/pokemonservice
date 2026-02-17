package com.projectpokemon.pokemonservice.factory.normalPokemon.farfetchdFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class FarfetchdFactoryTest {
    private static final String FARFETCHD = "Farfetch'd";

    FarfetchdFactory farfetchdFactory;

    @BeforeEach
    void setUp() {
        farfetchdFactory = new FarfetchdFactory();
    }

    @Test
    void supports_farfetchd() {
        assertEquals(FARFETCHD, farfetchdFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, farfetchdFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, farfetchdFactory.getEvolutionLevel());
    }
}