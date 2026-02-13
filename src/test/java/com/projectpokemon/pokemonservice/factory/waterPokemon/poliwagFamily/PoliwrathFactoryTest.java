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
    private static final String POLIWRATH = "Poliwrath";

    PoliwrathFactory poliwrathFactory;

    @BeforeEach
    void setUp() {
        poliwrathFactory = new PoliwrathFactory();
    }

    @Test
    void supports_poliwrath() {
        assertEquals(POLIWRATH, poliwrathFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, poliwrathFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve() {
        assertEquals(0, poliwrathFactory.getEvolutionLevel());
    }
}