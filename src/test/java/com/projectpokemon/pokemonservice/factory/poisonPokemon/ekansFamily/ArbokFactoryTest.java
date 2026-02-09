package com.projectpokemon.pokemonservice.factory.poisonPokemon.ekansFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ArbokFactoryTest {
    private static final String ARBOK = "Arbok";

    ArbokFactory arbokFactory;

    @BeforeEach
    void setUp() {
        arbokFactory = new ArbokFactory();
    }

    @Test
    void supports_arbok() {
        assertEquals(ARBOK, arbokFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, arbokFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve() {
        assertEquals(0, arbokFactory.getEvolutionLevel());
    }
}