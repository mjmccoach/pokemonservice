package com.projectpokemon.pokemonservice.factory.waterPokemon.goldeenFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class GoldeenFactoryTest {
    private static final String GOLDEEN = "Goldeen";
    private static final String SEAKING = "Seaking";

    GoldeenFactory goldeenFactory;

    @BeforeEach
    void setUp() {
        goldeenFactory = new GoldeenFactory();
    }

    @Test
    void supports_goldeen() {
        assertEquals(GOLDEEN, goldeenFactory.supports());
    }

    @Test
    void only_evolves_into_seaking() {
        assertEquals(SEAKING, goldeenFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_33() {
        assertEquals(33, goldeenFactory.getEvolutionLevel());
    }
}