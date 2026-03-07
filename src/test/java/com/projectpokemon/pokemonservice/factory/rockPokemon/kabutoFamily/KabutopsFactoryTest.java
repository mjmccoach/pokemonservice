package com.projectpokemon.pokemonservice.factory.rockPokemon.kabutoFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class KabutopsFactoryTest {
    private static final String KABUTOPS = "Kabutops";

    KabutopsFactory kabutopsFactory;

    @BeforeEach
    void setUp() {
        kabutopsFactory = new KabutopsFactory();
    }

    @Test
    void supports_kabutops() {
        assertEquals(KABUTOPS, kabutopsFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, kabutopsFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, kabutopsFactory.getEvolutionLevel());
    }
}