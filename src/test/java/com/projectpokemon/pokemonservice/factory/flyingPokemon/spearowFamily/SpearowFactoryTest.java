package com.projectpokemon.pokemonservice.factory.flyingPokemon.spearowFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SpearowFactoryTest {
    private static final String SPEAROW = "Spearow";
    private static final String FEAROW = "Fearow";

    SpearowFactory spearowFactory;

    @BeforeEach
    void setUp() {
        spearowFactory = new SpearowFactory();
    }

    @Test
    void supports_spearow() {
        assertEquals(SPEAROW, spearowFactory.supports());
    }

    @Test
    void only_evolves_into_fearow() {
        assertEquals(FEAROW, spearowFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_20() {
        assertEquals(20, spearowFactory.getEvolutionLevel());
    }
}