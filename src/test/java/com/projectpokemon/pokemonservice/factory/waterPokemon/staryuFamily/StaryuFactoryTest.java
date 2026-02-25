package com.projectpokemon.pokemonservice.factory.waterPokemon.staryuFamily;

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
class StaryuFactoryTest {
    private static final String STARYU = "Staryu";
    private static final String STARMIE = "Starmie";

    StaryuFactory staryuFactory;

    @BeforeEach
    void setUp() {
        staryuFactory = new StaryuFactory();
    }

    @Test
    void supports_staryu() {
        assertEquals(STARYU, staryuFactory.supports());
    }

    @Test
    void only_evolves_into_starmie() {
        assertEquals(STARMIE, staryuFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_with_waterstone() {
        assertEquals(0, staryuFactory.getEvolutionLevel());
        assertTrue(staryuFactory.evolvesWithStone());
        assertEquals(StoneType.WATER, staryuFactory.getEvolutionStone());
    }
}