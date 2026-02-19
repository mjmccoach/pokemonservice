package com.projectpokemon.pokemonservice.factory.ghostPokemon.gastlyFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class GastlyFactoryTest {
    private static final String GASTLY = "Gastly";
    private static final String HAUNTER = "Haunter";

    GastlyFactory gastlyFactory;

    @BeforeEach
    void setUp() {
        gastlyFactory = new GastlyFactory();
    }

    @Test
    void supports_gastly() {
        assertEquals(GASTLY, gastlyFactory.supports());
    }

    @Test
    void only_evolves_into_haunter() {
        assertEquals(HAUNTER, gastlyFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_25() {
        assertEquals(25, gastlyFactory.getEvolutionLevel());
    }
}