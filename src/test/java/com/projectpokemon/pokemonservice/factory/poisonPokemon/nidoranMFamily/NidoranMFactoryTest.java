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
class NidoranMFactoryTest {
    private static final String NIDORANM = "NidoranM";
    private static final String NIDORINO = "Nidorino";

    NidoranMFactory nidoranMFactory;

    @BeforeEach
    void setUp() {
        nidoranMFactory = new NidoranMFactory();
    }

    @Test
    void supports_nidoranm() {
        assertEquals(NIDORANM, nidoranMFactory.supports());
    }

    @Test
    void only_evolves_into_nidorino() {
        assertEquals(NIDORINO, nidoranMFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_16() {
        assertEquals(16, nidoranMFactory.getEvolutionLevel());
    }
}