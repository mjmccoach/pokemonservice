package com.projectpokemon.pokemonservice.factory.bugPokemon.caterpieFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class CaterpieFactoryTest {
    private static final String CATERPIE = "Caterpie";
    private static final String METAPOD = "Metapod";

    CaterpieFactory caterpieFactory;

    @BeforeEach
    void setUp() {
        caterpieFactory = new CaterpieFactory();
    }

    @Test
    void supports_caterpie() {
        assertEquals(CATERPIE, caterpieFactory.supports());
    }

    @Test
    void only_evolves_into_metapod() {
        assertEquals(METAPOD, caterpieFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_7() {
        assertEquals(7, caterpieFactory.getEvolutionLevel());
    }
}