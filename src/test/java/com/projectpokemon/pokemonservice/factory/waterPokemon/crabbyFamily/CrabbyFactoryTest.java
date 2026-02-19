package com.projectpokemon.pokemonservice.factory.waterPokemon.crabbyFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class CrabbyFactoryTest {
    private static final String CRABBY = "Crabby";
    private static final String KINGLER = "Kingler";

    CrabbyFactory crabbyFactory;

    @BeforeEach
    void setUp() {
        crabbyFactory = new CrabbyFactory();
    }

    @Test
    void supports_crabby() {
        assertEquals(CRABBY, crabbyFactory.supports());
    }

    @Test
    void evolves_into_kingler() {
        assertEquals(KINGLER, crabbyFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_28() {
        assertEquals(28, crabbyFactory.getEvolutionLevel());
    }
}