package com.projectpokemon.pokemonservice.factory.normalPokemon.jigglypuffFamily;

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
class JigglypuffFactoryTest {
    private static final String JIGGLYPUFF = "Jigglypuff";
    private static final String WIGGLYTUFF = "Wigglytuff";

    JigglypuffFactory jigglypuffFactory;

    @BeforeEach
    void setUp() {
        jigglypuffFactory = new JigglypuffFactory();
    }

    @Test
    void supports_jigglypuff() {
        assertEquals(JIGGLYPUFF, jigglypuffFactory.supports());
    }

    @Test
    void only_evolves_into_wigglytuff() {
        assertEquals(WIGGLYTUFF, jigglypuffFactory.validEvolutions().getFirst());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, jigglypuffFactory.getEvolutionLevel());
    }

    @Test
    void evolves_with_moonstone() {
        assertTrue(jigglypuffFactory.evolvesWithStone());
        assertEquals(StoneType.MOON, jigglypuffFactory.getEvolutionStone());
    }
}