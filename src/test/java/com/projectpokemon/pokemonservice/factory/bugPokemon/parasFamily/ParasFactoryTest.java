package com.projectpokemon.pokemonservice.factory.bugPokemon.parasFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ParasFactoryTest {
    private static final String PARAS = "Paras";
    private static final String PARASECT = "Parasect";

    ParasFactory parasFactory;

    @BeforeEach
    void setUp() {
        parasFactory = new ParasFactory();
    }

    @Test
    void supports_paras() {
        assertEquals(PARAS, parasFactory.supports());
    }

    @Test
    void only_evolves_into_parasect() {
        assertEquals(PARASECT, parasFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_24() {
        assertEquals(24, parasFactory.getEvolutionLevel());
    }
}