package com.projectpokemon.pokemonservice.factory.bugPokemon.weedleFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class BeedrillFactoryTest {

    private static final String BEEDRILL = "Beedrill";

    BeedrillFactory beedrillFactory;

    @BeforeEach
    void setUp() {
        beedrillFactory = new BeedrillFactory();
    }

    @Test
    void supports_beedrill() {
        assertEquals(BEEDRILL, beedrillFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, beedrillFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve() {
        assertEquals(0, beedrillFactory.getEvolutionLevel());
    }

}