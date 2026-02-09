package com.projectpokemon.pokemonservice.factory.poisonPokemon.ekansFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class EkansFactoryTest {
    private static final String EKANS = "Ekans";
    private static final String ARBOK = "Arbok";

    EkansFactory ekansFactory;

    @BeforeEach
    void setUp() {
        ekansFactory = new EkansFactory();
    }

    @Test
    void supports_ekans() {
        assertEquals(EKANS, ekansFactory.supports());
    }

    @Test
    void only_evolves_into_arbok() {
        assertEquals(ARBOK, ekansFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_22() {
        assertEquals(22, ekansFactory.getEvolutionLevel());
    }
}