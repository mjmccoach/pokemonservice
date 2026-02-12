package com.projectpokemon.pokemonservice.factory.firePokemon.growlitheFamily;

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
class GrowlitheFactoryTest {
    private static final String GROWLITHE = "Growlithe";
    private static final String ARCANINE = "Arcanine";

    GrowlitheFactory growlitheFactory;

    @BeforeEach
    void setUp() {
        growlitheFactory = new GrowlitheFactory();
    }

    @Test
    void supports_growlithe() {
        assertEquals(GROWLITHE, growlitheFactory.supports());
    }

    @Test
    void only_evolves_into_arcanine() {
        assertEquals(ARCANINE, growlitheFactory.validEvolutions().getFirst());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, growlitheFactory.getEvolutionLevel());
    }

    @Test
    void evolves_with_firestone() {
        assertTrue(growlitheFactory.evolvesWithStone());
        assertEquals(StoneType.FIRE, growlitheFactory.getEvolutionStone());
    }
}