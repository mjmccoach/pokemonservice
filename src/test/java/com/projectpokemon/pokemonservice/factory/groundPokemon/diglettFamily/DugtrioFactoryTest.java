package com.projectpokemon.pokemonservice.factory.groundPokemon.diglettFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class DugtrioFactoryTest {
    private static final String DUGTRIO = "Dugtrio";

    DugtrioFactory dugtrioFactory;

    @BeforeEach
    void setUp() {
        dugtrioFactory = new DugtrioFactory();
    }

    @Test
    void supports_dugtrio() {
        assertEquals(DUGTRIO, dugtrioFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, dugtrioFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve() {
        assertEquals(0, dugtrioFactory.getEvolutionLevel());
    }
}