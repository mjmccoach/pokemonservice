package com.projectpokemon.pokemonservice.factory.grassPokemon.bellsproutFamily;

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
class WeepinbellFactoryTest {
    private static final String WEEPINBELL = "Weepinbell";
    private static final String VICTREEBEL = "Victreebel";

    WeepinbellFactory weepinbellFactory;

    @BeforeEach
    void setUp() {
        weepinbellFactory = new WeepinbellFactory();
    }

    @Test
    void supports_weepinbell() {
        assertEquals(WEEPINBELL, weepinbellFactory.supports());
    }

    @Test
    void only_evolves_into_victreebel() {
        assertEquals(VICTREEBEL, weepinbellFactory.validEvolutions().getFirst());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, weepinbellFactory.getEvolutionLevel());
    }

    @Test
    void evolves_with_leaf_stone() {
        assertTrue(weepinbellFactory.evolvesWithStone());
        assertEquals(StoneType.LEAF, weepinbellFactory.getEvolutionStone());
    }
}