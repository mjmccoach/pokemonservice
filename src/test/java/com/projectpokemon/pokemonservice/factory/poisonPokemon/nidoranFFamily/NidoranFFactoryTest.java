package com.projectpokemon.pokemonservice.factory.poisonPokemon.nidoranFFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class NidoranFFactoryTest {
    private static final String NIDORANF = "NidoranF";
    private static final String NIDORINA = "Nidorina";

    NidoranFFactory nidoranFFactory;

    @BeforeEach
    void setUp() {
        nidoranFFactory = new NidoranFFactory();
    }

    @Test
    void supports_nidoranf() {
        assertEquals(NIDORANF, nidoranFFactory.supports());
    }

    @Test
    void only_evolves_into_nidorina() {
        assertEquals(NIDORINA, nidoranFFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_16() {
        assertEquals(16, nidoranFFactory.getEvolutionLevel());
    }
}