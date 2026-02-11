package com.projectpokemon.pokemonservice.factory.bugPokemon.venonatFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class VenomothFactoryTest {
    private static final String VENOMOTH = "Venomoth";

    VenomothFactory venomothFactory;

    @BeforeEach
    void setUp() {
        venomothFactory = new VenomothFactory();
    }

    @Test
    void supports_venomoth() {
        assertEquals(VENOMOTH, venomothFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, venomothFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve() {
        assertEquals(0, venomothFactory.getEvolutionLevel());
    }
}