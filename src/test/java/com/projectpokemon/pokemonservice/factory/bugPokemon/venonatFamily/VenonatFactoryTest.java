package com.projectpokemon.pokemonservice.factory.bugPokemon.venonatFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class VenonatFactoryTest {
    private static final String VENONAT = "Venonat";
    private static final String VENOMOTH = "Venomoth";

    VenonatFactory venonatFactory;

    @BeforeEach
    void setUp() {
        venonatFactory = new VenonatFactory();
    }

    @Test
    void supports_venonat() {
        assertEquals(VENONAT, venonatFactory.supports());
    }

    @Test
    void only_evolves_into_venomoth() {
        assertEquals(VENOMOTH, venonatFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_31() {
        assertEquals(31, venonatFactory.getEvolutionLevel());
    }
}