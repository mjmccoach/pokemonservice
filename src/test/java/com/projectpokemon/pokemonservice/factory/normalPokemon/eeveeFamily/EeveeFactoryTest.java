package com.projectpokemon.pokemonservice.factory.normalPokemon.eeveeFamily;

import com.projectpokemon.pokemonservice.enums.StoneType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class EeveeFactoryTest {
    private static final String EEVEE = "Eevee";
    private static final String FLAREON = "Flareon";
    private static final String JOLTEON = "Jolteon";
    private static final String VAPOREON = "Vaporeon";

    EeveeFactory eeveeFactory;

    @BeforeEach
    void setUp() {
        eeveeFactory = new EeveeFactory();
    }

    @Test
    void supports_eevee() {
        assertEquals(EEVEE, eeveeFactory.supports());
    }

    @Test
    void evolves_into_flareon_jolteon_and_vaporeon() {
        assertEquals(3, eeveeFactory.validEvolutions().size());
        assertEquals(FLAREON, eeveeFactory.validEvolutions().getFirst());
        assertEquals(JOLTEON, eeveeFactory.validEvolutions().get(1));
        assertEquals(VAPOREON, eeveeFactory.validEvolutions().get(2));
    }

    @Test
    void can_evolve_with_multiple_different_stones() {
        assertEquals(StoneType.FIRE, eeveeFactory.getEvolutionStone().getFirst());
        assertEquals(StoneType.THUNDER, eeveeFactory.getEvolutionStone().get(1));
        assertEquals(StoneType.WATER, eeveeFactory.getEvolutionStone().get(2));
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, eeveeFactory.getEvolutionLevel());
    }
}