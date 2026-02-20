package com.projectpokemon.pokemonservice.factory.electricPokemon.voltorbFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ElectrodeFactoryTest {
    private static final String VOLTORB = "Voltorb";
    private static final String ELECTRODE = "Electrode";

    VoltorbFactory voltorbFactory;

    @BeforeEach
    void setUp() {
        voltorbFactory = new VoltorbFactory();
    }

    @Test
    void supports_voltorb() {
        assertEquals(VOLTORB, voltorbFactory.supports());
    }

    @Test
    void only_evolves_into_electrode() {
        assertEquals(ELECTRODE, voltorbFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_30() {
        assertEquals(30, voltorbFactory.getEvolutionLevel());
    }
}