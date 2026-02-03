package com.projectpokemon.pokemonservice.factory.waterPokemon.squirtleFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class BlastoiseFactoryTest {
    private static final String BLASTOISE = "Blastoise";

    BlastoiseFactory blastoiseFactory;

    @BeforeEach
    void setUp() {
        blastoiseFactory = new BlastoiseFactory();
    }

    @Test
    void supports_blastoise() {
        assertEquals(BLASTOISE, blastoiseFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, blastoiseFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_so_valid_evolution_level_is_0() {
        assertEquals(0, blastoiseFactory.getEvolutionLevel());
    }
}