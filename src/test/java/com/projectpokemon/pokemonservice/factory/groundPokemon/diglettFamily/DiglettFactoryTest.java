package com.projectpokemon.pokemonservice.factory.groundPokemon.diglettFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class DiglettFactoryTest {
    private static final String DIGLETT = "Diglett";
    private static final String DUGTRIO = "Dugtrio";

    DiglettFactory diglettFactory;

    @BeforeEach
    void setUp() {
        diglettFactory = new DiglettFactory();
    }

    @Test
    void supports_diglett() {
        assertEquals(DIGLETT, diglettFactory.supports());
    }

    @Test
    void only_evolves_into_dugtrio() {
        assertEquals(DUGTRIO, diglettFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_26() {
        assertEquals(26, diglettFactory.getEvolutionLevel());
    }
}