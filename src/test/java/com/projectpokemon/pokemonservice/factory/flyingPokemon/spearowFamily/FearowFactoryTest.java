package com.projectpokemon.pokemonservice.factory.flyingPokemon.spearowFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class FearowFactoryTest {
    private static final String FEAROW = "Fearow";

    FearowFactory fearowFactory;

    @BeforeEach
    void setUp() {
        fearowFactory = new FearowFactory();
    }

    @Test
    void supports_fearow() {
        assertEquals(FEAROW, fearowFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, fearowFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve() {
        assertEquals(0, fearowFactory.getEvolutionLevel());
    }
}