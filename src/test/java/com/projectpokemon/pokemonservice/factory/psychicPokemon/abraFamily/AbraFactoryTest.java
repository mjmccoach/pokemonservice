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
class AbraFactoryTest {
    private static final String ABRA = "Abra";
    private static final String KADABRA = "Kadabra";

    AbraFactory abraFactory;

    @BeforeEach
    void setUp() {
        abraFactory = new AbraFactory();
    }

    @Test
    void supports_abra() {
        assertEquals(ABRA, abraFactory.supports());
    }

    @Test
    void only_evolves_into_kadabra() {
        assertEquals(KADABRA, abraFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_16() {
        assertEquals(16, abraFactory.getEvolutionLevel());
    }
}