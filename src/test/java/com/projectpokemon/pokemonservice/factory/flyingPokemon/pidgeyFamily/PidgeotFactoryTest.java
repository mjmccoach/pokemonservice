package com.projectpokemon.pokemonservice.factory.flyingPokemon.pidgeyFamily;

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
class PidgeotFactoryTest {
    private static final String PIDGEOT = "Pidgeot";

    PidgeotFactory pidgeotFactory;

    @BeforeEach
    void setUp() {
        pidgeotFactory = new PidgeotFactory();
    }

    @Test
    void supports_pidgeot() {
        assertEquals(PIDGEOT, pidgeotFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, pidgeotFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve() {
        assertEquals(0, pidgeotFactory.getEvolutionLevel());
    }

    @Test
    void has_resistances() {
        assertEquals(3, pidgeotFactory.getFlyingResistances().size());
        assertEquals(PokemonType.FIGHTING, pidgeotFactory.getFlyingResistances().getFirst());
        assertEquals(PokemonType.BUG, pidgeotFactory.getFlyingResistances().get(1));
        assertEquals(PokemonType.GRASS, pidgeotFactory.getFlyingResistances().get(2));
    }
}