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
class MarowakFactoryTest {
    private static final String MAROWAK = "Marowak";

    MarowakFactory marowakFactory;

    @BeforeEach
    void setUp() {
        marowakFactory = new MarowakFactory();
    }

    @Test
    void supports_marowak() {
        assertEquals(MAROWAK, marowakFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, marowakFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, marowakFactory.getEvolutionLevel());
    }
}