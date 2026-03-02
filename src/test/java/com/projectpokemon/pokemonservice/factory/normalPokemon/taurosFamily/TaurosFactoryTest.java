package com.projectpokemon.pokemonservice.factory.normalPokemon.taurosFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class TaurosFactoryTest {
    private static final String TAUROS = "Tauros";

    TaurosFactory taurosFactory;

    @BeforeEach
    void setUp() {
        taurosFactory = new TaurosFactory();
    }

    @Test
    void supports_tauros() {
        assertEquals(TAUROS, taurosFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, taurosFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, taurosFactory.getEvolutionLevel());
    }
}