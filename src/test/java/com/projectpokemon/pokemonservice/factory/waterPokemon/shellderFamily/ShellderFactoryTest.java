package com.projectpokemon.pokemonservice.factory.waterPokemon.shellderFamily;

import com.projectpokemon.pokemonservice.enums.StoneType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ShellderFactoryTest {
    private static final String SHELLDER = "Shellder";
    private static final String CLOYSTER = "Cloyster";

    ShellderFactory shellderFactory;

    @BeforeEach
    void setUp() {
        shellderFactory = new ShellderFactory();
    }

    @Test
    void supports_shellder() {
        assertEquals(SHELLDER, shellderFactory.supports());
    }

    @Test
    void only_evolves_into_cloyster() {
        assertEquals(CLOYSTER, shellderFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_with_waterstone() {
        assertTrue(shellderFactory.evolvesWithStone());
        assertEquals(StoneType.WATER, shellderFactory.getEvolutionStone());
    }
}