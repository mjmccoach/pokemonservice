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
class MeowthFactoryTest {
    private static final String MEOWTH = "Meowth";
    private static final String PERSIAN = "Persian";

    MeowthFactory meowthFactory;

    @BeforeEach
    void setUp() {
        meowthFactory = new MeowthFactory();
    }

    @Test
    void supports_meowth() {
        assertEquals(MEOWTH, meowthFactory.supports());
    }

    @Test
    void only_evolves_into_persian() {
        assertEquals(PERSIAN, meowthFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_28() {
        assertEquals(28, meowthFactory.getEvolutionLevel());
    }
}