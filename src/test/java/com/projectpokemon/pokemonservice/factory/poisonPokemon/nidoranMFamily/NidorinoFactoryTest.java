package com.projectpokemon.pokemonservice.factory.poisonPokemon.nidoranMFamily;

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
class NidorinoFactoryTest {
    private static final String NIDORINO = "Nidorino";
    private static final String NIDOKING = "Nidoking";

    NidorinoFactory nidorinoFactory;

    @BeforeEach
    void setUp() {
        nidorinoFactory = new NidorinoFactory();
    }

    @Test
    void supports_nidorino() {
        assertEquals(NIDORINO, nidorinoFactory.supports());
    }

    @Test
    void only_evolves_into_nidoking() {
        assertEquals(NIDOKING, nidorinoFactory.validEvolutions().getFirst());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, nidorinoFactory.getEvolutionLevel());
    }

    @Test
    void evolves_by_stone() {
        assertTrue(nidorinoFactory.evolvesWithStone());
    }

    @Test
    void evolves_with_moonstone() {
        assertEquals(StoneType.MOON, nidorinoFactory.getEvolutionStone());
    }
}