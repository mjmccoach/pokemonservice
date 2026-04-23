package com.projectpokemon.pokemonservice.factory.firePokemon.growlitheFamily;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ArcanineFactoryTest {
    private static final String ARCANINE = "Arcanine";

    ArcanineFactory arcanineFactory;

    @BeforeEach
    void setUp() {
        arcanineFactory = new ArcanineFactory();
    }

    @Test
    void supports_arcanine() {
        assertEquals(ARCANINE, arcanineFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, arcanineFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, arcanineFactory.getEvolutionLevel());
    }

    @Test
    void has_resistances() {
        assertEquals(6, arcanineFactory.getFireResistances().size());
        assertEquals(PokemonType.FIRE, arcanineFactory.getFireResistances().getFirst());
        assertEquals(PokemonType.GRASS, arcanineFactory.getFireResistances().get(1));
        assertEquals(PokemonType.ICE, arcanineFactory.getFireResistances().get(2));
        assertEquals(PokemonType.BUG, arcanineFactory.getFireResistances().get(3));
        assertEquals(PokemonType.STEEL, arcanineFactory.getFireResistances().get(4));
        assertEquals(PokemonType.FAIRY, arcanineFactory.getFireResistances().get(5));
    }
}