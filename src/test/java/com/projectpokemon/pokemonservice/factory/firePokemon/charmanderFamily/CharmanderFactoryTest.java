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
class CharmanderFactoryTest {
    private static final String CHARMANDER = "Charmander";
    private static final String CHARMELEON = "Charmeleon";

    CharmanderFactory charmanderFactory;

    @BeforeEach
    void setUp() {
        charmanderFactory = new CharmanderFactory();
    }

    @Test
    void supports_charmander() {
        assertEquals(CHARMANDER, charmanderFactory.supports());
    }

    @Test
    void only_evolves_into_charmeleon() {
        assertEquals(CHARMELEON, charmanderFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_16() {
        assertEquals(16, charmanderFactory.getEvolutionLevel());
    }

    @Test
    void does_not_evolve_with_firestone() {
        assertFalse(charmanderFactory.canEvolveWithFireStone());
    }
}