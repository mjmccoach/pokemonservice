package com.projectpokemon.pokemonservice.factory.fightingPokemon.machopFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class MachopFactoryTest {
    private static final String MACHOP = "Machop";
    private static final String MACHOKE = "Machoke";

    MachopFactory machopFactory;

    @BeforeEach
    void setUp() {
        machopFactory = new MachopFactory();
    }

    @Test
    void supports_machop() {
        assertEquals(MACHOP, machopFactory.supports());
    }

    @Test
    void only_evolves_into_machoke() {
        assertEquals(MACHOKE, machopFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_28() {
        assertEquals(28, machopFactory.getEvolutionLevel());
    }
}