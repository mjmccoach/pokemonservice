package com.projectpokemon.pokemonservice.factory.flyingPokemon.pidgeyFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class PidgeotFactoryTest {
    private static final String PIDGEOT = "Pidgeot";

    PidgeotFactory pidgeotFactory;

    @BeforeEach
    void setUp() {
        pidgeotFactory = new PidgeotFactory();
    }

    @Test
    void supports_pidgeot() {
        assertEquals(PIDGEOT, pidgeotFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, pidgeotFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve() {
        assertEquals(0, pidgeotFactory.getEvolutionLevel());
    }
}