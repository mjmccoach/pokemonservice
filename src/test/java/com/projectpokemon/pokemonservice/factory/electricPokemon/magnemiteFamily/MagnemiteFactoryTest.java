package com.projectpokemon.pokemonservice.factory.electricPokemon.magnemiteFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class MagnemiteFactoryTest {
    private static final String MAGNEMITE = "Magnemite";
    private static final String MAGNETON = "Magneton";

    MagnemiteFactory magnemiteFactory;

    @BeforeEach
    void setUp() {
        magnemiteFactory = new MagnemiteFactory();
    }

    @Test
    void supports_magnemite() {
        assertEquals(MAGNEMITE, magnemiteFactory.supports());
    }

    @Test
    void only_evolves_into_magneton() {
        assertEquals(MAGNETON, magnemiteFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_30() {
        assertEquals(30, magnemiteFactory.getEvolutionLevel());
    }
}