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
class CharizardFactoryTest {
    private static final String CHARIZARD = "Charizard";

    CharizardFactory charizardFactory;

    @BeforeEach
    void setUp() {
        charizardFactory = new CharizardFactory();
    }

    @Test
    void supports_charizard() {
        assertEquals(CHARIZARD, charizardFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, charizardFactory.validEvolutions().size());
    }

    @Test
    void does_not_have_an_evolution_level() {
        assertEquals(0, charizardFactory.getEvolutionLevel());
    }

    @Test
    void does_not_evolve_with_firestone() {
        assertFalse(charizardFactory.canEvolveWithFireStone());
    }
}