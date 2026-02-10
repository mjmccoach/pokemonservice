package com.projectpokemon.pokemonservice.factory.normalPokemon.jigglypuffFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class WigglytuffFactoryTest {
    private static final String WIGGLYTUFF = "Wigglytuff";

    WigglytuffFactory wigglytuffFactory;

    @BeforeEach
    void setUp() {
        wigglytuffFactory = new WigglytuffFactory();
    }

    @Test
    void supports_wigglytuff() {
        assertEquals(WIGGLYTUFF, wigglytuffFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, wigglytuffFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, wigglytuffFactory.getEvolutionLevel());
    }
}