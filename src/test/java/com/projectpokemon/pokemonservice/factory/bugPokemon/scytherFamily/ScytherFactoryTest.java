package com.projectpokemon.pokemonservice.factory.bugPokemon.scytherFamily;

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
class ScytherFactoryTest {
    private static final String SCYTHER = "Scyther";

    ScytherFactory scytherFactory;

    @BeforeEach
    void setUp() {
        scytherFactory = new ScytherFactory();
    }

    @Test
    void supports_scyther() {
        assertEquals(SCYTHER, scytherFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, scytherFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, scytherFactory.getEvolutionLevel());
    }

    @Test
    void has_resistances() {
        assertEquals(3, scytherFactory.getBugPokemonResistances().size());
        assertEquals(PokemonType.GRASS, scytherFactory.getBugPokemonResistances().getFirst());
        assertEquals(PokemonType.FIGHTING, scytherFactory.getBugPokemonResistances().get(1));
        assertEquals(PokemonType.GROUND, scytherFactory.getBugPokemonResistances().get(2));
    }
}