package com.projectpokemon.pokemonservice.factory.groundPokemon.cuboneFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class CuboneFactoryTest {
    private static final String CUBONE = "Cubone";
    private static final String MAROWAK = "Marowak";

    CuboneFactory cuboneFactory;

    @BeforeEach
    void setUp() {
        cuboneFactory = new CuboneFactory();
    }

    @Test
    void supports_cubone() {
        assertEquals(CUBONE, cuboneFactory.supports());
    }

    @Test
    void only_evolves_into_marowak() {
        assertEquals(MAROWAK, cuboneFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_28() {
        assertEquals(28, cuboneFactory.getEvolutionLevel());
    }
}