package com.projectpokemon.pokemonservice.factory.grassPokemon.bellsproutFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class BellsproutFactoryTest {
    private static final String BELLSPROUT = "Bellsprout";
    private static final String WEEPINBELL = "Weepinbell";

    BellsproutFactory bellsproutFactory;

    @BeforeEach
    void setUp() {
        bellsproutFactory = new BellsproutFactory();
    }

    @Test
    void supports_bellsprout() {
        assertEquals(BELLSPROUT, bellsproutFactory.supports());
    }

    @Test
    void only_evolves_into_weepinbell() {
        assertEquals(WEEPINBELL, bellsproutFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_21() {
        assertEquals(21, bellsproutFactory.getEvolutionLevel());
    }
}