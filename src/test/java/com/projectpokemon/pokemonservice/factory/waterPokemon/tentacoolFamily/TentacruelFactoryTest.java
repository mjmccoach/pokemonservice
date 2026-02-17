package com.projectpokemon.pokemonservice.factory.waterPokemon.tentacoolFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class TentacruelFactoryTest {
    private static final String TENTACRUEL = "Tentacruel";

    TentacruelFactory tentacruelFactory;

    @BeforeEach
    void setUp() {
        tentacruelFactory = new TentacruelFactory();
    }

    @Test
    void supports_tentacruel() {
        assertEquals(TENTACRUEL, tentacruelFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, tentacruelFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, tentacruelFactory.getEvolutionLevel());
    }
}