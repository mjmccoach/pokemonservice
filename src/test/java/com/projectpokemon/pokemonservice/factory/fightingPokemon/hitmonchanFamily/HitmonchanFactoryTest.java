package com.projectpokemon.pokemonservice.factory.fightingPokemon.hitmonchanFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class HitmonchanFactoryTest {
    private static final String HITMONCHAN = "Hitmonchan";

    HitmonchanFactory hitmonchanFactory;

    @BeforeEach
    void setUp() {
        hitmonchanFactory = new HitmonchanFactory();
    }

    @Test
    void supports_hitmonchan() {
        assertEquals(HITMONCHAN, hitmonchanFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, hitmonchanFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, hitmonchanFactory.getEvolutionLevel());
    }
}