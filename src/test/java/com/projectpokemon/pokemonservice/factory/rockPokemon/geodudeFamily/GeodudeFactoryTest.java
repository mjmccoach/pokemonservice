package com.projectpokemon.pokemonservice.factory.rockPokemon.geodudeFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class GeodudeFactoryTest {
    private static final String GEODUDE = "Geodude";
    private static final String GRAVELER = "Graveler";

    GeodudeFactory geodudeFactory;

    @BeforeEach
    void setUp() {
        geodudeFactory = new GeodudeFactory();
    }

    @Test
    void supports_geodude() {
        assertEquals(GEODUDE, geodudeFactory.supports());
    }

    @Test
    void only_evolves_into_graveler() {
        assertEquals(GRAVELER, geodudeFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_25() {
        assertEquals(25, geodudeFactory.getEvolutionLevel());
    }
}