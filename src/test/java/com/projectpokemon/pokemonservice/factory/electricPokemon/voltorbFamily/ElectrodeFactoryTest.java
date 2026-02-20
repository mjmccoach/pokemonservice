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
    private static final String ELECTRODE = "Electrode";

    ElectrodeFactory electrodeFactory;

    @BeforeEach
    void setUp() {
        electrodeFactory = new ElectrodeFactory();
    }

    @Test
    void supports_electrode() {
        assertEquals(ELECTRODE, electrodeFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, electrodeFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, electrodeFactory.getEvolutionLevel());
    }
}