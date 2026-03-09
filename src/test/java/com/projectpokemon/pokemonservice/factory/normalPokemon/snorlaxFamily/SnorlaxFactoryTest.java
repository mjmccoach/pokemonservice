package com.projectpokemon.pokemonservice.factory.normalPokemon.snorlaxFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SnorlaxFactoryTest {
    private static final String SNORLAX = "Snorlax";

    SnorlaxFactory snorlaxFactory;

    @BeforeEach
    void setUp() {
        snorlaxFactory = new SnorlaxFactory();
    }

    @Test
    void supports_snorlax() {
        assertEquals(SNORLAX, snorlaxFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, snorlaxFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, snorlaxFactory.getEvolutionLevel());
    }
}