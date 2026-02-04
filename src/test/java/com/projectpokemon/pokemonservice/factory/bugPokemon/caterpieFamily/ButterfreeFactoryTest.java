package com.projectpokemon.pokemonservice.factory.bugPokemon.caterpieFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ButterfreeFactoryTest {
    private static final String BUTTERFREE = "Butterfree";

    ButterfreeFactory butterfreeFactory;

    @BeforeEach
    void setUp() {
        butterfreeFactory = new ButterfreeFactory();
    }

    @Test
    void supports_butterfree() {
        assertEquals(BUTTERFREE, butterfreeFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, butterfreeFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve() {
        assertEquals(0, butterfreeFactory.getEvolutionLevel());
    }
}