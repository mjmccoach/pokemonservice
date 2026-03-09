package com.projectpokemon.pokemonservice.factory.dragonPokemon.dratiniFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class DragonairFactoryTest {
    private static final String DRAGONAIR = "Dragonair";
    private static final String DRAGONITE = "Dragonite";

    DragonairFactory dragonairFactory;

    @BeforeEach
    void setUp() {
        dragonairFactory = new DragonairFactory();
    }

    @Test
    void supports_dragonair() {
        assertEquals(DRAGONAIR, dragonairFactory.supports());
    }

    @Test
    void only_evolves_into_dragonite() {
        assertEquals(DRAGONITE, dragonairFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_55() {
        assertEquals(55, dragonairFactory.getEvolutionLevel());
    }
}