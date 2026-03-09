package com.projectpokemon.pokemonservice.factory.icePokemon.arcticunoFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ArcticunoFactoryTest {
    private static final String ARCTICUNO = "Arcticuno";

    ArcticunoFactory arcticunoFactory;

    @BeforeEach
    void setUp() {
        arcticunoFactory = new ArcticunoFactory();
    }

    @Test
    void supports_arcticuno() {
        assertEquals(ARCTICUNO, arcticunoFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, arcticunoFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, arcticunoFactory.getEvolutionLevel());
    }
}