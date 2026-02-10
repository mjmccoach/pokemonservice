package com.projectpokemon.pokemonservice.factory.firePokemon.vulpixFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class NinetalesFactoryTest {
    private static final String NINETALES = "Ninetales";

    NinetalesFactory ninetalesFactory;

    @BeforeEach
    void setUp() {
        ninetalesFactory = new NinetalesFactory();
    }

    @Test
    void supports_ninetales() {
        assertEquals(NINETALES, ninetalesFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, ninetalesFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, ninetalesFactory.getEvolutionLevel());
    }
}