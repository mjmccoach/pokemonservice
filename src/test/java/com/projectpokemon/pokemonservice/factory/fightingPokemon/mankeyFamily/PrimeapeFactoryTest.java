package com.projectpokemon.pokemonservice.factory.fightingPokemon.mankeyFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class PrimeapeFactoryTest {
    private static final String PRIMEAPE = "Primeape";

    PrimeapeFactory primeapeFactory;

    @BeforeEach
    void setUp() {
        primeapeFactory = new PrimeapeFactory();
    }

    @Test
    void supports_primeape() {
        assertEquals(PRIMEAPE, primeapeFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, primeapeFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve() {
        assertEquals(0, primeapeFactory.getEvolutionLevel());
    }
}