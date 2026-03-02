package com.projectpokemon.pokemonservice.factory.bugPokemon.pinsirFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class PinsirFactoryTest {
    private static final String PINSIR = "Pinsir";

    PinsirFactory pinsirFactory;

    @BeforeEach
    void setUp() {
        pinsirFactory = new PinsirFactory();
    }

    @Test
    void supports_pinsir() {
        assertEquals(PINSIR, pinsirFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, pinsirFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, pinsirFactory.getEvolutionLevel());
    }
}