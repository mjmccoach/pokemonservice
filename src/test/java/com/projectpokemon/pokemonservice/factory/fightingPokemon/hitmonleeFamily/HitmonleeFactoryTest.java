package com.projectpokemon.pokemonservice.factory.fightingPokemon.hitmonleeFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class HitmonleeFactoryTest {
    private static final String HITMONLEE = "Hitmonlee";

    HitmonleeFactory hitmonleeFactory;

    @BeforeEach
    void setUp() {
        hitmonleeFactory = new HitmonleeFactory();
    }

    @Test
    void supports_hitmonlee() {
        assertEquals(HITMONLEE, hitmonleeFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, hitmonleeFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, hitmonleeFactory.getEvolutionLevel());
    }
}