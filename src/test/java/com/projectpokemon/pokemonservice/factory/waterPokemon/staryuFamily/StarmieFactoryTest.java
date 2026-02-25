package com.projectpokemon.pokemonservice.factory.waterPokemon.staryuFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StarmieFactoryTest {
    private static final String STARMIE = "Starmie";

    StarmieFactory starmieFactory;

    @BeforeEach
    void setUp() {
        starmieFactory = new StarmieFactory();
    }

    @Test
    void supports_starmie() {
        assertEquals(STARMIE, starmieFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, starmieFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, starmieFactory.getEvolutionLevel());
    }
}