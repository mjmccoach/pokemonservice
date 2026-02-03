package com.projectpokemon.pokemonservice.factory.firePokemon.charmanderFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class CharmeleonFactoryTest {
    private static final String CHARMELEON = "Charmeleon";
    private static final String CHARIZARD = "Charizard";

    CharmeleonFactory charmeleonFactory;

    @BeforeEach
    void setUp() {
        charmeleonFactory = new CharmeleonFactory();
    }

    @Test
    void supports_charmeleon() {
        assertEquals(CHARMELEON, charmeleonFactory.supports());
    }

    @Test
    void only_evolves_into_charizard() {
        assertEquals(CHARIZARD, charmeleonFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_36() {
        assertEquals(36, charmeleonFactory.getEvolutionLevel());
    }

    @Test
    void does_not_evolve_with_firestone() {
        assertFalse(charmeleonFactory.canEvolveWithFireStone());
    }
}