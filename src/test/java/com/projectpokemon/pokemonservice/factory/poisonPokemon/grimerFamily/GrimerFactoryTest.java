package com.projectpokemon.pokemonservice.factory.poisonPokemon.grimerFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class GrimerFactoryTest {
    private static final String GRIMER = "Grimer";
    private static final String MUK = "Muk";

    GrimerFactory grimerFactory;

    @BeforeEach
    void setUp() {
        grimerFactory = new GrimerFactory();
    }

    @Test
    void supports_grimer() {
        assertEquals(GRIMER, grimerFactory.supports());
    }

    @Test
    void only_evolves_into_muk() {
        assertEquals(MUK, grimerFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_38() {
        assertEquals(38, grimerFactory.getEvolutionLevel());
    }
}