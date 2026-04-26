package com.projectpokemon.pokemonservice.factory.grassPokemon.bulbasaurFamily;

import com.projectpokemon.pokemonservice.enums.PokemonType;
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
    void has_no_valid_evolutions() {
        assertEquals(0, venusaurFactory.validEvolutions().size());
    }

    @Test
    void has_no_evolution_level() {
        assertEquals(0, venusaurFactory.getEvolutionLevel());
    }

    @Test
    void does_not_evolve_with_leafstone() {
        assertFalse(venusaurFactory.canEvolveWithLeafStone());
    }

    @Test
    void has_resistances() {
        assertEquals(4, venusaurFactory.getGrassResistances().size());
        assertEquals(PokemonType.WATER, venusaurFactory.getGrassResistances().getFirst());
        assertEquals(PokemonType.ELECTRIC, venusaurFactory.getGrassResistances().get(1));
        assertEquals(PokemonType.GRASS, venusaurFactory.getGrassResistances().get(2));
        assertEquals(PokemonType.GROUND, venusaurFactory.getGrassResistances().get(3));
    }
}