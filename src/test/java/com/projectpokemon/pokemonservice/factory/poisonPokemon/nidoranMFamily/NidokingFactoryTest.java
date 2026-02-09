package com.projectpokemon.pokemonservice.factory.poisonPokemon.nidoranMFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class NidokingFactoryTest {
    private static final String NIDOKING = "Nidoking";

    NidokingFactory nidokingFactory;

    @BeforeEach
    void setUp() {
        nidokingFactory = new NidokingFactory();
    }

    @Test
    void supports_nidoking() {
        assertEquals(NIDOKING, nidokingFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, nidokingFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, nidokingFactory.getEvolutionLevel());
    }

}