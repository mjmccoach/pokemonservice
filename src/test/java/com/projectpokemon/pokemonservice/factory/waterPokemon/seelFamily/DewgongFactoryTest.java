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
class DewgongFactoryTest {
    private static final String DEWGONG = "Dewgong";

    DewgongFactory dewgongFactory;

    @BeforeEach
    void setUp() {
        dewgongFactory = new DewgongFactory();
    }

    @Test
    void supports_dewgong() {
        assertEquals(DEWGONG, dewgongFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, dewgongFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, dewgongFactory.getEvolutionLevel());
    }
}