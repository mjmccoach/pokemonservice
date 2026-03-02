package com.projectpokemon.pokemonservice.factory.waterPokemon.magikarpFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class MagikarpFactoryTest {
    private static final String MAGIKARP = "Magikarp";
    private static final String GYARADOS = "Gyarados";

    MagikarpFactory magikarpFactory;

    @BeforeEach
    void setUp() {
        magikarpFactory = new MagikarpFactory();
    }

    @Test
    void supports_magikarp() {
        assertEquals(MAGIKARP, magikarpFactory.supports());
    }

    @Test
    void only_evolves_into_gyarados() {
        assertEquals(GYARADOS, magikarpFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_20() {
        assertEquals(20, magikarpFactory.getEvolutionLevel());
    }
}