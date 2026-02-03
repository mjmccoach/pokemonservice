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
class IvysaurFactoryTest {
    private static final String IVYSAUR = "Ivysaur";
    private static final String VENUSAUR = "Venusaur";

    IvysaurFactory ivysaurFactory;

    @BeforeEach
    void setUp() {
        ivysaurFactory = new IvysaurFactory();
    }

    @Test
    void supports_ivysaur() {
        assertEquals(IVYSAUR, ivysaurFactory.supports());
    }

    @Test
    void only_evolves_into_venusaur() {
        assertEquals(VENUSAUR, ivysaurFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_32() {
        assertEquals(32, ivysaurFactory.getEvolutionLevel());
    }

    @Test
    void does_not_evolve_with_leafstone() {
        assertFalse(ivysaurFactory.canEvolveWithLeafStone());
    }
}