package com.projectpokemon.pokemonservice.factory.normalPokemon.porygonFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class PorygonFactoryTest {
    private static final String PORYGON = "Porygon";

    PorygonFactory porygonFactory;

    @BeforeEach
    void setUp() {
        porygonFactory = new PorygonFactory();
    }

    @Test
    void supports_porygon() {
        assertEquals(PORYGON, porygonFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, porygonFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, porygonFactory.getEvolutionLevel());
    }
}