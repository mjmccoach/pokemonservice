package com.projectpokemon.pokemonservice.factory.normalPokemon.doduoFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class DodrioFactoryTest {
    private static final String DODRIO = "Dodrio";

    DodrioFactory dodrioFactory;

    @BeforeEach
    void setUp() {
        dodrioFactory = new DodrioFactory();
    }

    @Test
    void supports_dodrio() {
        assertEquals(DODRIO, dodrioFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, dodrioFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, dodrioFactory.getEvolutionLevel());
    }
}