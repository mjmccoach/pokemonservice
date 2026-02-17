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
class DoduoFactoryTest {
    private static final String DODUO = "Doduo";
    private static final String DODRIO = "Dodrio";

    DoduoFactory doduoFactory;

    @BeforeEach
    void setUp() {
        doduoFactory = new DoduoFactory();
    }

    @Test
    void supports_doduo() {
        assertEquals(DODUO, doduoFactory.supports());
    }

    @Test
    void only_evolves_into_dodrio() {
        assertEquals(DODRIO, doduoFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_30() {
        assertEquals(31, doduoFactory.getEvolutionLevel());
    }
}