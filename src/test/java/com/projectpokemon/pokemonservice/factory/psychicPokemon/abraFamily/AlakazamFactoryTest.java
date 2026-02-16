package com.projectpokemon.pokemonservice.factory.psychicPokemon.abraFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class AlakazamFactoryTest {
    private static final String ALAKAZAM = "Alakazam";

    AlakazamFactory alakazamFactory;

    @BeforeEach
    void setUp() {
        alakazamFactory = new AlakazamFactory();
    }

    @Test
    void supports_alakazam() {
        assertEquals(ALAKAZAM, alakazamFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, alakazamFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, alakazamFactory.getEvolutionLevel());
    }
}