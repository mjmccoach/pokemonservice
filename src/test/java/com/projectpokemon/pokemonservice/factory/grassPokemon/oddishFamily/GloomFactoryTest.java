package com.projectpokemon.pokemonservice.factory.grassPokemon.oddishFamily;

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
class GloomFactoryTest {
    private static final String GLOOM = "Gloom";
    private static final String VILEPLUME = "Vileplume";

    GloomFactory gloomFactory;

    @BeforeEach
    void setUp() {
        gloomFactory = new GloomFactory();
    }

    @Test
    void supports_gloom() {
        assertEquals(GLOOM, gloomFactory.supports());
    }

    @Test
    void only_evolves_into_vileplume() {
        assertEquals(VILEPLUME, gloomFactory.validEvolutions().getFirst());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, gloomFactory.getEvolutionLevel());
    }

    @Test
    void evolves_with_leafstone() {
        assertTrue(gloomFactory.evolvesWithStone());
        assertEquals(StoneType.LEAF, gloomFactory.getEvolutionStone());
    }
}