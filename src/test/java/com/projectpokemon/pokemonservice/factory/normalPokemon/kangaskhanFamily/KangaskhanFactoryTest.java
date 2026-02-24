package com.projectpokemon.pokemonservice.factory.normalPokemon.kangaskhanFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class KangaskhanFactoryTest {
    private static final String KANGASKHAN = "Kangaskhan";

    KangaskhanFactory kangaskhanFactory;

    @BeforeEach
    void setUp() {
        kangaskhanFactory = new KangaskhanFactory();
    }

    @Test
    void supports_kangaskhan() {
        assertEquals(KANGASKHAN, kangaskhanFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, kangaskhanFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, kangaskhanFactory.getEvolutionLevel());
    }
}