package com.projectpokemon.pokemonservice.factory.poisonPokemon.koffingFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class KoffingFactoryTest {
    private static final String KOFFING = "Koffing";
    private static final String WEEZING = "Weezing";

    KoffingFactory koffingFactory;

    @BeforeEach
    void setUp() {
        koffingFactory = new KoffingFactory();
    }

    @Test
    void supports_koffing() {
        assertEquals(KOFFING, koffingFactory.supports());
    }

    @Test
    void only_evolves_into_weezing() {
        assertEquals(WEEZING, koffingFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_35() {
        assertEquals(35, koffingFactory.getEvolutionLevel());
    }
}