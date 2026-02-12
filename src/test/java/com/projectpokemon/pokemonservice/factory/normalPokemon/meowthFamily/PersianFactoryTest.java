package com.projectpokemon.pokemonservice.factory.normalPokemon.meowthFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class PersianFactoryTest {
    private static final String PERSIAN = "Persian";

    PersianFactory persianFactory;

    @BeforeEach
    void setUp() {
        persianFactory = new PersianFactory();
    }

    @Test
    void supports_persian() {
        assertEquals(PERSIAN, persianFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, persianFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve() {
        assertEquals(0, persianFactory.getEvolutionLevel());
    }
}