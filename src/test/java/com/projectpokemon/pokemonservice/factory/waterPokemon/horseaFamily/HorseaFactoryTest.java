package com.projectpokemon.pokemonservice.factory.waterPokemon.horseaFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class HorseaFactoryTest {
    private static final String HORSEA = "Horsea";
    private static final String SEADRA = "Seadra";

    HorseaFactory horseaFactory;

    @BeforeEach
    void setUp() {
        horseaFactory = new HorseaFactory();
    }

    @Test
    void supports_horsea() {
        assertEquals(HORSEA, horseaFactory.supports());
    }

    @Test
    void only_evolves_into_seadra() {
        assertEquals(SEADRA, horseaFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_32() {
        assertEquals(32, horseaFactory.getEvolutionLevel());
    }
}