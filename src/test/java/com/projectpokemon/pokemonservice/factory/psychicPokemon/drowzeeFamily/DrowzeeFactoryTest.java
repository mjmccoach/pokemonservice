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
class DrowzeeFactoryTest {
    private static final String DROWZEE = "Drowzee";
    private static final String HYPNO = "Hypno";

    DrowzeeFactory drowzeeFactory;

    @BeforeEach
    void setUp() {
        drowzeeFactory = new DrowzeeFactory();
    }

    @Test
    void supports_drowzee() {
        assertEquals(DROWZEE, drowzeeFactory.supports());
    }

    @Test
    void evolves_into_hypno() {
        assertEquals(HYPNO, drowzeeFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_26() {
        assertEquals(26, drowzeeFactory.getEvolutionLevel());
    }
}