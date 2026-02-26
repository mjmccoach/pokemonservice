package com.projectpokemon.pokemonservice.factory.icePokemon.jynxFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class JynxFactoryTest {
    private static final String JYNX = "Jynx";

    JynxFactory jynxFactory;

    @BeforeEach
    void setUp() {
        jynxFactory = new JynxFactory();
    }

    @Test
    void supports_jynx() {
        assertEquals(JYNX, jynxFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, jynxFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, jynxFactory.getEvolutionLevel());
    }
}