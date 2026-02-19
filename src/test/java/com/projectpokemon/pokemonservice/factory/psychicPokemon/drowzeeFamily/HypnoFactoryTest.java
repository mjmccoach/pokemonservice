package com.projectpokemon.pokemonservice.factory.psychicPokemon.drowzeeFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class HypnoFactoryTest {
    private static final String HYPNO = "Hypno";

    HypnoFactory hypnoFactory;

    @BeforeEach
    void setUp() {
        hypnoFactory = new HypnoFactory();
    }

    @Test
    void supports_hypno() {
        assertEquals(HYPNO, hypnoFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, hypnoFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, hypnoFactory.getEvolutionLevel());
    }
}