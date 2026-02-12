package com.projectpokemon.pokemonservice.factory.waterPokemon.psyduckFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class PsyduckFactoryTest {
    private static final String PSYDUCK = "Psyduck";
    private static final String GOLDUCK = "Golduck";

    PsyduckFactory psyduckFactory;

    @BeforeEach
    void setUp() {
        psyduckFactory = new PsyduckFactory();
    }

    @Test
    void supports_psyduck() {
        assertEquals(PSYDUCK, psyduckFactory.supports());
    }

    @Test
    void only_evolves_into_golduck() {
        assertEquals(GOLDUCK, psyduckFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_33() {
        assertEquals(33, psyduckFactory.getEvolutionLevel());
    }
}