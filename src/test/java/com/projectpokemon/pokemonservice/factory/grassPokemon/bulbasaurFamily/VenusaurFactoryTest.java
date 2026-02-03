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
class VenusaurFactoryTest {
    private static final String VENUSAUR = "Venusaur";

    VenusaurFactory venusaurFactory;

    @BeforeEach
    void setUp() {
        venusaurFactory = new VenusaurFactory();
    }

    @Test
    void supports_ivysaur() {
        assertEquals(VENUSAUR, venusaurFactory.supports());
    }

    @Test
    void only_evolves_into_venusaur() {
        assertEquals(0, venusaurFactory.validEvolutions().size());
    }

    @Test
    void evolves_at_level_32() {
        assertEquals(0, venusaurFactory.getEvolutionLevel());
    }

    @Test
    void does_not_evolve_with_leafstone() {
        assertFalse(venusaurFactory.canEvolveWithLeafStone());
    }
}