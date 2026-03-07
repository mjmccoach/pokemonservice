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
class KabutoFactoryTest {
    private static final String KABUTO = "Kabuto";
    private static final String KABUTOPS = "Kabutops";

    KabutoFactory kabutoFactory;

    @BeforeEach
    void setUp() {
        kabutoFactory = new KabutoFactory();
    }

    @Test
    void supports_kabuto() {
        assertEquals(KABUTO, kabutoFactory.supports());
    }

    @Test
    void only_evolves_into_kabutops() {
        assertEquals(KABUTOPS, kabutoFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_40() {
        assertEquals(40, kabutoFactory.getEvolutionLevel());
    }
}