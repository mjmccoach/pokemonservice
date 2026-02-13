package com.projectpokemon.pokemonservice.factory.waterPokemon.poliwagFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class PoliwagFactoryTest {
    private static final String POLIWAG = "Poliwag";
    private static final String POLIWHIRL = "Poliwhirl";

    PoliwagFactory poliwagFactory;

    @BeforeEach
    void setUp() {
        poliwagFactory = new PoliwagFactory();
    }

    @Test
    void supports_poliwag() {
        assertEquals(POLIWAG, poliwagFactory.supports());
    }

    @Test
    void only_evolves_into_poliwhirl() {
        assertEquals(POLIWHIRL, poliwagFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_25() {
        assertEquals(25, poliwagFactory.getEvolutionLevel());
    }
}