package com.projectpokemon.pokemonservice.factory.groundPokemon.rhyhornFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class RhyhornFactoryTest {
    private static final String RHYHORN = "Rhyhorn";
    private static final String RHYDON = "Rhydon";

    RhyhornFactory rhyhornFactory;

    @BeforeEach
    void setUp() {
        rhyhornFactory = new RhyhornFactory();
    }

    @Test
    void supports_rhyhorn() {
        assertEquals(RHYHORN, rhyhornFactory.supports());
    }

    @Test
    void only_evolves_into_rhydon() {
        assertEquals(RHYDON, rhyhornFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_42() {
        assertEquals(42, rhyhornFactory.getEvolutionLevel());
    }
}