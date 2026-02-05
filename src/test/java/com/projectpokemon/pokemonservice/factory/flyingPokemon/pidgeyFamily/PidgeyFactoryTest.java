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
class PidgeyFactoryTest {
    private static final String PIDGEY = "Pidgey";
    private static final String PIDGEOTTO = "Pidgeotto";


    PidgeyFactory pidgeyFactory;

    @BeforeEach
    void setUp() {
        pidgeyFactory = new PidgeyFactory();
    }

    @Test
    void supports_pidgey() {
        assertEquals(PIDGEY, pidgeyFactory.supports());
    }

    @Test
    void only_evolves_into_pidgeotto() {
        assertEquals(PIDGEOTTO, pidgeyFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_at_level_18() {
        assertEquals(18, pidgeyFactory.getEvolutionLevel());
    }
}