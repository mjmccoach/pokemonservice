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
class MankeyFactoryTest {
    private static final String MANKEY = "Mankey";
    private static final String PRIMEAPE = "Primeape";

    MankeyFactory mankeyFactory;

    @BeforeEach
    void setUp() {
        mankeyFactory = new MankeyFactory();
    }

    @Test
    void supports_mankey() {
        assertEquals(MANKEY, mankeyFactory.supports());
    }

    @Test
    void only_evolves_into_primeape() {
        assertEquals(PRIMEAPE, mankeyFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_28() {
        assertEquals(28, mankeyFactory.getEvolutionLevel());
    }
}