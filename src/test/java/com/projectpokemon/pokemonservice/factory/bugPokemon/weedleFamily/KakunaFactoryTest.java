package com.projectpokemon.pokemonservice.factory.bugPokemon.weedleFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class KakunaFactoryTest {
    private static final String KAKUNA = "Kakuna";
    private static final String BEEDRILL = "Beedrill";

    KakunaFactory kakunaFactory;

    @BeforeEach
    void setUp() {
        kakunaFactory = new KakunaFactory();
    }

    @Test
    void supports_kakuna() {
        assertEquals(KAKUNA, kakunaFactory.supports());
    }

    @Test
    void only_evolves_into_beedrill() {
        assertEquals(BEEDRILL, kakunaFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_10() {
        assertEquals(10, kakunaFactory.getEvolutionLevel());
    }
}