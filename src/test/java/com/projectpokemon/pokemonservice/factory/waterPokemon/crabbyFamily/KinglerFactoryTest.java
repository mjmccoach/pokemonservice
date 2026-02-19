package com.projectpokemon.pokemonservice.factory.waterPokemon.crabbyFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class KinglerFactoryTest {
    private static final String KINGLER = "Kingler";

    KinglerFactory kinglerFactory;

    @BeforeEach
    void setUp() {
        kinglerFactory = new KinglerFactory();
    }

    @Test
    void supports_kingler() {
        assertEquals(KINGLER, kinglerFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, kinglerFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, kinglerFactory.getEvolutionLevel());
    }
}