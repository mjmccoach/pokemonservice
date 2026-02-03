package com.projectpokemon.pokemonservice.factory.waterPokemon.squirtleFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SquirtleFactoryTest {
    private static final String SQUIRTLE = "Squirtle";
    private static final String WARTORTLE = "Wartortle";

    SquirtleFactory squirtleFactory;

    @BeforeEach
    void setUp() {
        squirtleFactory = new SquirtleFactory();
    }

    @Test
    void supports_squirtle() {
        assertEquals(SQUIRTLE, squirtleFactory.supports());
    }

    @Test
    void only_evolves_into_wartortle() {
        assertEquals(WARTORTLE, squirtleFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_16() {
        assertEquals(16, squirtleFactory.getEvolutionLevel());
    }
}