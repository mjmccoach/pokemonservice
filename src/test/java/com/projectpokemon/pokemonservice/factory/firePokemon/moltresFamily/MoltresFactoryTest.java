package com.projectpokemon.pokemonservice.factory.firePokemon.moltresFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class MoltresFactoryTest {
    private static final String MOLTRES = "Moltres";

    MoltresFactory moltresFactory;

    @BeforeEach
    void setUp() {
        moltresFactory = new MoltresFactory();
    }

    @Test
    void supports_moltres() {
        assertEquals(MOLTRES, moltresFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, moltresFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, moltresFactory.getEvolutionLevel());
    }
}