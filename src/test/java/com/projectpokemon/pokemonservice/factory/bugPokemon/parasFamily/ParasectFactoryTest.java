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
class ParasectFactoryTest {
    private static final String PARASECT = "Parasect";

    ParasectFactory parasectFactory;

    @BeforeEach
    void setUp() {
        parasectFactory = new ParasectFactory();
    }

    @Test
    void supports_parasect() {
        assertEquals(PARASECT, parasectFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, parasectFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve() {
        assertEquals(0, parasectFactory.getEvolutionLevel());
    }
}