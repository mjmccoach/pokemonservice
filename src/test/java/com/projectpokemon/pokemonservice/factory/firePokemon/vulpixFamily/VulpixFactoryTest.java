package com.projectpokemon.pokemonservice.factory.firePokemon.vulpixFamily;

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
class VulpixFactoryTest {
    private static final String VULPIX = "Vulpix";
    private static final String NINETALES = "Ninetales";

    VulpixFactory vulpixFactory;

    @BeforeEach
    void setUp() {
        vulpixFactory = new VulpixFactory();
    }

    @Test
    void supports_vulpixr() {
        assertEquals(VULPIX, vulpixFactory.supports());
    }

    @Test
    void only_evolves_into_ninetales() {
        assertEquals(NINETALES, vulpixFactory.validEvolutions().getFirst());
    }

    @Test
    void does_not_evolve_by_level() {
        assertEquals(0, vulpixFactory.getEvolutionLevel());
    }

    @Test
    void evolves_with_firestone() {
        assertTrue(vulpixFactory.evolvesWithStone());
        assertEquals(StoneType.FIRE, vulpixFactory.getEvolutionStone());
    }
}