package com.projectpokemon.pokemonservice.factory.electricPokemon.pikachuFamily;

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
class PikachuFactoryTest {
    private static final String PIKACHU = "Pikachu";
    private static final String RAICHU = "Raichu";

    PikachuFactory pikachuFactory;

    @BeforeEach
    void setUp() {
        pikachuFactory = new PikachuFactory();
    }

    @Test
    void supports_pikachu() {
        assertEquals(PIKACHU, pikachuFactory.supports());
    }

    @Test
    void only_evolves_into_raichu() {
        assertEquals(RAICHU, pikachuFactory.validEvolutions().getFirst());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, pikachuFactory.getEvolutionLevel());
    }

    @Test
    void evolves_with_thunderstone() {
        assertTrue(pikachuFactory.evolvesWithThunderStone());
    }
}