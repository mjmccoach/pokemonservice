package com.projectpokemon.pokemonservice.factory.rockPokemon.aerodactylFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class AerodactylFactoryTest {
    private static final String AERODACTYL = "Aerodactyl";

    AerodactylFactory aerodactylFactory;

    @BeforeEach
    void setUp() {
        aerodactylFactory = new AerodactylFactory();
    }

    @Test
    void supports_aerodactyl() {
        assertEquals(AERODACTYL, aerodactylFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, aerodactylFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, aerodactylFactory.getEvolutionLevel());
    }
}