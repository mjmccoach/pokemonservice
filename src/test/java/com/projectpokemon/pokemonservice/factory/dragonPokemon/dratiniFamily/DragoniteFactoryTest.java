package com.projectpokemon.pokemonservice.factory.dragonPokemon.dratiniFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class DragoniteFactoryTest {
    private static final String DRAGONITE = "Dragonite";

    DragoniteFactory dragoniteFactory;

    @BeforeEach
    void setUp() {
        dragoniteFactory = new DragoniteFactory();
    }

    @Test
    void supports_dragonite() {
        assertEquals(DRAGONITE, dragoniteFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, dragoniteFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, dragoniteFactory.getEvolutionLevel());
    }
}