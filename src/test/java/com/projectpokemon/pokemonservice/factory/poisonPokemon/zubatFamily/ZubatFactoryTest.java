package com.projectpokemon.pokemonservice.factory.poisonPokemon.zubatFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ZubatFactoryTest {
    private static final String ZUBAT = "Zubat";
    private static final String GOLBAT = "Golbat";

    ZubatFactory zubatFactory;

    @BeforeEach
    void setUp() {
        zubatFactory = new ZubatFactory();
    }

    @Test
    void supports_zubat() {
        assertEquals(ZUBAT, zubatFactory.supports());
    }

    @Test
    void only_evolves_into_golbat() {
        assertEquals(GOLBAT, zubatFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_22() {
        assertEquals(22, zubatFactory.getEvolutionLevel());
    }
}