package com.projectpokemon.pokemonservice.factory.normalPokemon.chanseyFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ChanseyFactoryTest {
    private static final String CHANSEY = "Chansey";

    ChanseyFactory chanseyFactory;

    @BeforeEach
    void setUp() {
        chanseyFactory = new ChanseyFactory();
    }

    @Test
    void supports_chansey() {
        assertEquals(CHANSEY, chanseyFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, chanseyFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, chanseyFactory.getEvolutionLevel());
    }
}