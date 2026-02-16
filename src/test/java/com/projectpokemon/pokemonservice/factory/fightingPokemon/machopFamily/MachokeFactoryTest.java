package com.projectpokemon.pokemonservice.factory.fightingPokemon.machopFamily;

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
class MachokeFactoryTest {
    private static final String MACHOKE = "Machoke";
    private static final String MACHAMP = "Machamp";


    MachokeFactory machokeFactory;

    @BeforeEach
    void setUp() {
        machokeFactory = new MachokeFactory();
    }

    @Test
    void supports_machoke() {
        assertEquals(MACHOKE, machokeFactory.supports());
    }

    @Test
    void only_evolves_into_machamp() {
        assertEquals(MACHAMP, machokeFactory.validEvolutions().getFirst());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, machokeFactory.getEvolutionLevel());
    }

    @Test
    void evolves_with_trade() {
        assertTrue(machokeFactory.evolvesWithTrade());
    }
}