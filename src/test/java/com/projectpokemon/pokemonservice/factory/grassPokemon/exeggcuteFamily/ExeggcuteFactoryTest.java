package com.projectpokemon.pokemonservice.factory.grassPokemon.exeggcuteFamily;

import com.projectpokemon.pokemonservice.enums.StoneType;
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
class ExeggcuteFactoryTest {
    private static final String EXEGGCUTE = "Exeggcute";
    private static final String EXEGGCUTOR = "Exeggutor";

    ExeggcuteFactory exeggcuteFactory;

    @BeforeEach
    void setUp() {
        exeggcuteFactory = new ExeggcuteFactory();
    }

    @Test
    void supports_exeggcute() {
        assertEquals(EXEGGCUTE, exeggcuteFactory.supports());
    }

    @Test
    void only_evolves_into_exeggcutor() {
        assertEquals(EXEGGCUTOR, exeggcuteFactory.validEvolutions().getFirst());
    }

    @Test
    void evolves_with_leafstone() {
        assertTrue(exeggcuteFactory.evolvesWithStone());
        assertEquals(StoneType.LEAF, exeggcuteFactory.getEvolutionStone());
    }
}