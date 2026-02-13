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
class PoliwrathFactoryTest {
    private static final String POLIWHIRL = "Poliwhirl";
    private static final String POLIWRATH = "Poliwrath";

    PoliwhirlFactory poliwhirlFactory;

    @BeforeEach
    void setUp() {
        poliwhirlFactory = new PoliwhirlFactory();
    }

    @Test
    void supports_poliwrath() {
        assertEquals(POLIWHIRL, poliwhirlFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(POLIWRATH, poliwhirlFactory.validEvolutions().getFirst());
    }

    @Test
    void does_not_evolve() {
        assertEquals(0, poliwhirlFactory.getEvolutionLevel());
    }
}