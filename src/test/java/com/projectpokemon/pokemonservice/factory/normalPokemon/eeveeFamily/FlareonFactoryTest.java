package com.projectpokemon.pokemonservice.factory.normalPokemon.eeveeFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class FlareonFactoryTest {
    private static final String FLAREON = "Flareon";

    FlareonFactory flareonFactory;

    @BeforeEach
    void setUp() {
        flareonFactory = new FlareonFactory();
    }

    @Test
    void supports_flareon() {
        assertEquals(FLAREON, flareonFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, flareonFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, flareonFactory.getEvolutionLevel());
    }
}