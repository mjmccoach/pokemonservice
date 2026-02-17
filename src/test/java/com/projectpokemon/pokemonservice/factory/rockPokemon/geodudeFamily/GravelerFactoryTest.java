package com.projectpokemon.pokemonservice.factory.rockPokemon.geodudeFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class GravelerFactoryTest {
    private static final String GRAVELER = "Graveler";
    private static final String GOLEM = "Golem";

    GravelerFactory gravelerFactory;

    @BeforeEach
    void setUp() {
        gravelerFactory = new GravelerFactory();
    }

    @Test
    void supports_graveler() {
        assertEquals(GRAVELER, gravelerFactory.supports());
    }

    @Test
    void only_evolves_into_golem() {
        assertEquals(GOLEM, gravelerFactory.validEvolutions().getFirst());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, gravelerFactory.getEvolutionLevel());
    }

    @Test
    void evolves_by_trade() {
        assertTrue(gravelerFactory.evolvesWithTrade());
    }
}