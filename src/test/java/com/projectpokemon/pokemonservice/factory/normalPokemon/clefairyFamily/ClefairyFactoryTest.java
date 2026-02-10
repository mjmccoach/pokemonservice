package com.projectpokemon.pokemonservice.factory.normalPokemon.clefairyFamily;

import com.projectpokemon.pokemonservice.enums.StoneType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ClefairyFactoryTest {
    private static final String CLEFAIRY = "Clefairy";
    private static final String CLEFABLE = "Clefable";

    ClefairyFactory clefairyFactory;

    @BeforeEach
    void setUp() {
        clefairyFactory = new ClefairyFactory();
    }

    @Test
    void supports_clefairy() {
        assertEquals(CLEFAIRY, clefairyFactory.supports());
    }

    @Test
    void only_evolves_into_clefable() {
        assertEquals(CLEFABLE, clefairyFactory.validEvolutions().getFirst());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, clefairyFactory.getEvolutionLevel());
    }

    @Test
    void evolves_by_moonstone() {
        assertTrue(clefairyFactory.evolvesWithStone());
        assertEquals(StoneType.MOON, clefairyFactory.getEvolutionStone());
    }
}