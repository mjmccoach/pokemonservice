package com.projectpokemon.pokemonservice.factory.electricPokemon.zapdosFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ZapdosFactoryTest {
    private static final String ZAPDOS = "Zapdos";

    ZapdosFactory zapdosFactory;

    @BeforeEach
    void setUp() {
        zapdosFactory = new ZapdosFactory();
    }

    @Test
    void supports_zapdos() {
        assertEquals(ZAPDOS, zapdosFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, zapdosFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, zapdosFactory.getEvolutionLevel());
    }
}