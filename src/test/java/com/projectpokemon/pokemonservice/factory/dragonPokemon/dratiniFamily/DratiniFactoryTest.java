package com.projectpokemon.pokemonservice.factory.dragonPokemon.dratiniFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class DratiniFactoryTest {
    private static final String DRATINI = "Dratini";
    private static final String DRAGONAIR = "Dragonair";

    DratiniFactory dratiniFactory;

    @BeforeEach
    void setUp() {
        dratiniFactory = new DratiniFactory();
    }

    @Test
    void supports_dratini() {
        assertEquals(DRATINI, dratiniFactory.supports());
    }

    @Test
    void only_evolves_into_dragonair() {
        assertEquals(DRAGONAIR, dratiniFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_30() {
        assertEquals(30, dratiniFactory.getEvolutionLevel());
    }
}