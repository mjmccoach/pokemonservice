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
class TentacoolFactoryTest {
    private static final String TENTACOOL = "Tentacool";
    private static final String TENTACRUEL = "Tentacruel";

    TentacoolFactory tentacoolFactory;

    @BeforeEach
    void setUp() {
        tentacoolFactory = new TentacoolFactory();
    }

    @Test
    void supports_tentacool() {
        assertEquals(TENTACOOL, tentacoolFactory.supports());
    }

    @Test
    void only_evolves_into_tentacruel() {
        assertEquals(TENTACRUEL, tentacoolFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_30() {
        assertEquals(30, tentacoolFactory.getEvolutionLevel());
    }
}