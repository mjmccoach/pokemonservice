package com.projectpokemon.pokemonservice.factory.firePokemon.ponytaFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class PonytaFactoryTest {
    private static final String PONYTA = "Ponyta";
    private static final String RAPIDASH = "Rapidash";

    PonytaFactory ponytaFactory;

    @BeforeEach
    void setUp() {
        ponytaFactory = new PonytaFactory();
    }

    @Test
    void supports_ponyta() {
        assertEquals(PONYTA, ponytaFactory.supports());
    }

    @Test
    void only_evolves_into_rapidash() {
        assertEquals(RAPIDASH, ponytaFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_40() {
        assertEquals(40, ponytaFactory.getEvolutionLevel());
    }
}