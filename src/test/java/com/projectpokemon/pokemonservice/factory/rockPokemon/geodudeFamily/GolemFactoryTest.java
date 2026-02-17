package com.projectpokemon.pokemonservice.factory.rockPokemon.geodudeFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class GolemFactoryTest {
    private static final String GOLEM = "Golem";

    GolemFactory golemFactory;

    @BeforeEach
    void setUp() {
        golemFactory = new GolemFactory();
    }

    @Test
    void supports_golemgs() {
        assertEquals(GOLEM, golemFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, golemFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, golemFactory.getEvolutionLevel());
    }
}