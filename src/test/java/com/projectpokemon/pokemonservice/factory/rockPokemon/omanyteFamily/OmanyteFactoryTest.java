package com.projectpokemon.pokemonservice.factory.rockPokemon.omanyteFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class OmanyteFactoryTest {
    private static final String OMANYTE = "Omanyte";
    private static final String OMASTAR = "Omastar";


    OmanyteFactory omanyteFactory;

    @BeforeEach
    void setUp() {
        omanyteFactory = new OmanyteFactory();
    }

    @Test
    void supports_omanyte() {
        assertEquals(OMANYTE, omanyteFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(OMASTAR, omanyteFactory.validEvolutions().getFirst());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(40, omanyteFactory.getEvolutionLevel());
    }
}