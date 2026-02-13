package com.projectpokemon.pokemonservice.factory.waterPokemon.poliwagFamily;

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
class PoliwhirlFactoryTest {
    private static final String POLIWHIRL = "Poliwhirl";
    private static final String POLIWRATH = "Poliwrath";

    PoliwhirlFactory poliwhirlFactory;

    @BeforeEach
    void setUp() {
        poliwhirlFactory = new PoliwhirlFactory();
    }

    @Test
    void supports_poliwhirl() {
        assertEquals(POLIWHIRL, poliwhirlFactory.supports());
    }

    @Test
    void only_evolves_into_poliwrath() {
        assertEquals(POLIWRATH, poliwhirlFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_with_waterstone() {
        assertTrue(poliwhirlFactory.evolvesWithStone());
        assertEquals(StoneType.WATER, poliwhirlFactory.getEvolutionStone());
    }
}