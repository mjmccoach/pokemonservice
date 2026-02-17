package com.projectpokemon.pokemonservice.factory.grassPokemon.bellsproutFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class VictreebelFactoryTest {
    private static final String VICTREEBEL = "Victreebel";

    VictreebelFactory victreebelFactory;

    @BeforeEach
    void setUp() {
        victreebelFactory = new VictreebelFactory();
    }

    @Test
    void supports_vileplume() {
        assertEquals(VICTREEBEL, victreebelFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, victreebelFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, victreebelFactory.getEvolutionLevel());
    }
}