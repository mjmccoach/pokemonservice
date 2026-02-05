package com.projectpokemon.pokemonservice.factory.flyingPokemon.pidgeyFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class PidgeottoFactoryTest {
    private static final String PIDGEOTTO = "Pidgeotto";
    private static final String PIDGEOT = "Pidgeot";

    PidgeottoFactory pidgeottoFactory;

    @BeforeEach
    void setUp() {
        pidgeottoFactory = new PidgeottoFactory();
    }

    @Test
    void supports_pidgeotto() {
        assertEquals(PIDGEOTTO, pidgeottoFactory.supports());
    }

    @Test
    void only_evolves_into_pidgeot() {
        assertEquals(PIDGEOT, pidgeottoFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_36() {
        assertEquals(36, pidgeottoFactory.getEvolutionLevel());
    }
}