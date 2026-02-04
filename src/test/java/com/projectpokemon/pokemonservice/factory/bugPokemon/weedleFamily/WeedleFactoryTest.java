package com.projectpokemon.pokemonservice.factory.bugPokemon.weedleFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class WeedleFactoryTest {
    private static final String WEEDLE = "Weedle";
    private static final String KAKUNA = "Kakuna";

    WeedleFactory weedleFactory;

    @BeforeEach
    void setUp() {
        weedleFactory = new WeedleFactory();
    }

    @Test
    void supports_weedle() {
        assertEquals(WEEDLE, weedleFactory.supports());
    }

    @Test
    void only_evolves_into_kakuna() {
        assertEquals(KAKUNA, weedleFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_7() {
        assertEquals(7, weedleFactory.getEvolutionLevel());
    }
}