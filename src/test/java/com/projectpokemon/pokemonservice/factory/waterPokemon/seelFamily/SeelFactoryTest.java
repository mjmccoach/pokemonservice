package com.projectpokemon.pokemonservice.factory.waterPokemon.seelFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SeelFactoryTest {
    private static final String SEEL = "Seel";
    private static final String DEWGONG = "Dewgong";

    SeelFactory seelFactory;

    @BeforeEach
    void setUp() {
        seelFactory = new SeelFactory();
    }

    @Test
    void supports_seel() {
        assertEquals(SEEL, seelFactory.supports());
    }

    @Test
    void only_evolves_into_dewgong() {
        assertEquals(DEWGONG, seelFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_34() {
        assertEquals(34, seelFactory.getEvolutionLevel());
    }
}