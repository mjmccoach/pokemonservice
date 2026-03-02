package com.projectpokemon.pokemonservice.factory.waterPokemon.magikarpFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class GyaradosFactoryTest {
    private static final String GYARADOS = "Gyarados";

    GyaradosFactory gyaradosFactory;

    @BeforeEach
    void setUp() {
        gyaradosFactory = new GyaradosFactory();
    }

    @Test
    void supports_gyarados() {
        assertEquals(GYARADOS, gyaradosFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, gyaradosFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, gyaradosFactory.getEvolutionLevel());
    }
}