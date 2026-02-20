package com.projectpokemon.pokemonservice.factory.grassPokemon.exeggcuteFamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ExeggcutorFactoryTest {
    private static final String EXEGGCUTOR = "Exeggcutor";

    ExeggcutorFactory exeggcutorFactory;

    @BeforeEach
    void setUp() {
        exeggcutorFactory = new ExeggcutorFactory();
    }

    @Test
    void supports_exeggcutor() {
        assertEquals(EXEGGCUTOR, exeggcutorFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, exeggcutorFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, exeggcutorFactory.getEvolutionLevel());
    }
}