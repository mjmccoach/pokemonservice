package com.projectpokemon.pokemonservice.factory.psychicPokemon.abraFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class KadabraFactoryTest {
    private static final String KADABRA = "Kadabra";
    private static final String ALAKAZAM = "Alakazam";

    KadabraFactory kadabraFactory;

    @BeforeEach
    void setUp() {
        kadabraFactory = new KadabraFactory();
    }

    @Test
    void supports_kadabra() {
        assertEquals(KADABRA, kadabraFactory.supports());
    }

    @Test
    void only_evolves_into_alakazam() {
        assertEquals(ALAKAZAM, kadabraFactory.validEvolutions().getFirst());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, kadabraFactory.getEvolutionLevel());
    }

    @Test
    void evolves_by_trade() {
        assertTrue(kadabraFactory.evolvesWithTrade());
    }
}