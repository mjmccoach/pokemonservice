package com.projectpokemon.pokemonservice.factory.grassPokemon.bulbasaurFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class BulbasaurFactoryTest {
    private static final String BULBASAUR = "Bulbasaur";
    private static final String IVYSAUR = "Ivysaur";

    BulbasaurFactory bulbasaurFactory;

    @BeforeEach
    void setUp() {
        bulbasaurFactory = new BulbasaurFactory();
    }

    @Test
    void supports_bulbasaur() {
        assertEquals(BULBASAUR, bulbasaurFactory.supports());
    }

    @Test
    void only_evolves_into_ivysaur() {
        assertEquals(IVYSAUR, bulbasaurFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_16() {
        assertEquals(16, bulbasaurFactory.getEvolutionLevel());
    }

    @Test
    void does_not_evolve_with_leafstone() {
        assertFalse(bulbasaurFactory.canEvolveWithLeafStone());
    }
}