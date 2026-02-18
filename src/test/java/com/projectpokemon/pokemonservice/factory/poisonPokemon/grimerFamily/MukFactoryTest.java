package com.projectpokemon.pokemonservice.factory.poisonPokemon.grimerFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class MukFactoryTest {
    private static final String MUK = "Muk";

    MukFactory mukFactory;

    @BeforeEach
    void setUp() {
        mukFactory = new MukFactory();
    }

    @Test
    void supports_muk() {
        assertEquals(MUK, mukFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, mukFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, mukFactory.getEvolutionLevel());
    }
}