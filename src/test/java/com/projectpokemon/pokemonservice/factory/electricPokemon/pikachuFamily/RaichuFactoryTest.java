package com.projectpokemon.pokemonservice.factory.electricPokemon.pikachuFamily;

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
class RaichuFactoryTest {
    private static final String RAICHU = "Raichu";

    RaichuFactory raichuFactory;

    @BeforeEach
    void setUp() {
        raichuFactory = new RaichuFactory();
    }

    @Test
    void supports_raichu() {
        assertEquals(RAICHU, raichuFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, raichuFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, raichuFactory.getEvolutionLevel());
    }

    @Test
    void does_not_evolve_with_thunderstone() {
        assertFalse(raichuFactory.evolvesWithThunderStone());
    }

    @Test
    void has_resistances() {
        assertEquals(3, raichuFactory.getElectricResistances().size());
        assertEquals(PokemonType.ELECTRIC, raichuFactory.getElectricResistances().getFirst());
        assertEquals(PokemonType.STEEL, raichuFactory.getElectricResistances().get(1));
        assertEquals(PokemonType.FLYING, raichuFactory.getElectricResistances().get(2));
    }
}