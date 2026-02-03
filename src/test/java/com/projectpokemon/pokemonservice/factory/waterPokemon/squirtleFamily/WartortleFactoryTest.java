package com.projectpokemon.pokemonservice.factory.waterPokemon.squirtleFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class WartortleFactoryTest {
    private static final String WARTORTLE = "Wartortle";
    private static final String BLASTOISE = "Blastoise";

    WartortleFactory wartortleFactory;

    @BeforeEach
    void setUp() {
        wartortleFactory = new WartortleFactory();
    }

    @Test
    void supports_wartortle() {
        assertEquals(WARTORTLE, wartortleFactory.supports());
    }

    @Test
    void only_evolves_into_blastoise() {
        assertEquals(BLASTOISE, wartortleFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_36() {
        assertEquals(36, wartortleFactory.getEvolutionLevel());
    }
}