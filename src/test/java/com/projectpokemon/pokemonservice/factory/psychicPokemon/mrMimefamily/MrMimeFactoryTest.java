package com.projectpokemon.pokemonservice.factory.psychicPokemon.mrMimefamily;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class MrMimeFactoryTest {
    private static final String MR_MIME = "Mr Mime";

    MrMimeFactory mrMimeFactory;

    @BeforeEach
    void setUp() {
        mrMimeFactory = new MrMimeFactory();
    }

    @Test
    void supports_mr_mime() {
        assertEquals(MR_MIME, mrMimeFactory.supports());
    }

    @Test
    void has_no_valid_evolutions() {
        assertEquals(0, mrMimeFactory.validEvolutions().size());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, mrMimeFactory.getEvolutionLevel());
    }
}