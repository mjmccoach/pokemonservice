package com.projectpokemon.pokemonservice.factory.bugPokemon.caterpieFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class MetapodFactoryTest {
    private static final String METAPOD = "Metapod";
    private static final String BUTTERFREE = "Butterfree";

    MetapodFactory metapodFactory;

    @BeforeEach
    void setUp() {
        metapodFactory = new MetapodFactory();
    }

    @Test
    void supports_metapod() {
        assertEquals(METAPOD, metapodFactory.supports());
    }

    @Test
    void only_evolves_into_butterfree() {
        assertEquals(BUTTERFREE, metapodFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_10() {
        assertEquals(10, metapodFactory.getEvolutionLevel());
    }
}