package com.projectpokemon.pokemonservice.factory.normalPokemon.rattataFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class RattataFactoryTest {
    private static final String RATTATA = "Rattata";
    private static final String RATICATE = "Raticate";

    RattataFactory rattataFactory;

    @BeforeEach
    void setUp() {
        rattataFactory = new RattataFactory();
    }

    @Test
    void supports_rattata() {
        assertEquals(RATTATA, rattataFactory.supports());
    }

    @Test
    void only_evolves_into_raticate() {
        assertEquals(RATICATE, rattataFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_20() {
        assertEquals(20, rattataFactory.getEvolutionLevel());
    }
}