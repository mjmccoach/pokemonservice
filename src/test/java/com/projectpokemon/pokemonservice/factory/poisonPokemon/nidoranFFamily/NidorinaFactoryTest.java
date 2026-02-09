package com.projectpokemon.pokemonservice.factory.poisonPokemon.nidoranFFamily;

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
class NidorinaFactoryTest {
    private static final String NIDORINA = "Nidorina";
    private static final String NIDOQUEEN = "Nidoqueen";

    NidorinaFactory nidorinaFactory;

    @BeforeEach
    void setUp() {
        nidorinaFactory = new NidorinaFactory();
    }

    @Test
    void supports_nidorina() {
        assertEquals(NIDORINA, nidorinaFactory.supports());
    }

    @Test
    void only_evolves_into_nidoqueen() {
        assertEquals(NIDOQUEEN, nidorinaFactory.validEvolutions().getFirst());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, nidorinaFactory.getEvolutionLevel());
    }

    @Test
    void evolves_by_stone() {
        assertTrue(nidorinaFactory.evolvesWithStone());
    }

    @Test
    void evolves_with_moonstone() {
        assertEquals(StoneType.MOON, nidorinaFactory.getEvolutionStone());
    }
}