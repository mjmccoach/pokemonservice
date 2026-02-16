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
class MachampFactoryTest {
    private static final String MACHAMP = "Machamp";

    MachampFactory machampFactory;

    @BeforeEach
    void setUp() {
        machampFactory = new MachampFactory();
    }

    @Test
    void supports_machamp() {
        assertEquals(MACHAMP, machampFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, machampFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, machampFactory.getEvolutionLevel());
    }
}