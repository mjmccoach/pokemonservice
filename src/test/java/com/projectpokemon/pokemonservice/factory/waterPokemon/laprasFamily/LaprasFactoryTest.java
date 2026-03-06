package com.projectpokemon.pokemonservice.factory.waterPokemon.laprasFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class LaprasFactoryTest {
    private static final String LAPRAS = "Lapras";

    LaprasFactory laprasFactory;

    @BeforeEach
    void setUp() {
        laprasFactory = new LaprasFactory();
    }

    @Test
    void supports_lapras() {
        assertEquals(LAPRAS, laprasFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, laprasFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, laprasFactory.getEvolutionLevel());
    }
}