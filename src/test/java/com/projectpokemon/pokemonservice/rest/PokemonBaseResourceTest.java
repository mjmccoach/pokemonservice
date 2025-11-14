package com.projectpokemon.pokemonservice.rest;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.objects.PokemonBase;
import com.projectpokemon.pokemonservice.objects.UpdatePokemonBasePayload;
import com.projectpokemon.pokemonservice.service.PokemonBaseService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class PokemonBaseResourceTest {

    private static final int ID_1 = 1;
    private static final String NAME_1 = "Bulbasaur";
    private static final int ID_2 = 2;
    private static final String NAME_2 = "Ivysaur";
    private static final String NAME_3 = "Squirtle";

    private PokemonBaseResource pokemonBaseResource;
    private PokemonBase pokemonBase1;
    private PokemonBase pokemonBase2;
    private PokemonBase pokemonBase3;
    @Mock
    private PokemonBaseService mockPokemonBaseService;

    @BeforeEach
    void setUp() {
        pokemonBaseResource = new PokemonBaseResource(mockPokemonBaseService);
        pokemonBase1 = new PokemonBase(ID_1, NAME_1, PokemonType.GRASS, null);
        pokemonBase2 = new PokemonBase(ID_2, NAME_2, PokemonType.GRASS, null);
        pokemonBase3 = new PokemonBase(1, NAME_3, PokemonType.WATER, null);
    }

    @Test
    void get_pokemon_by_id() {
        when(mockPokemonBaseService.getPokemonBaseById(anyInt())).thenReturn(pokemonBase1);

        PokemonBase actual = pokemonBaseResource.getPokemonBaseById(ID_1);

        verify(mockPokemonBaseService).getPokemonBaseById(ID_1);
        assertEquals(NAME_1, actual.getName());
        assertEquals(ID_1, actual.getId());
    }

    @Test
    void get_all_pokemon_bases() {
        when(mockPokemonBaseService.getAllPokemonBases()).thenReturn(Arrays.asList(pokemonBase1, pokemonBase2));

        List<PokemonBase> actual = pokemonBaseResource.getAllPokemonBases();

        verify(mockPokemonBaseService).getAllPokemonBases();

        assertEquals(2, actual.size());
        assertEquals(NAME_1, actual.getFirst().getName());
        assertEquals(ID_1, actual.getFirst().getId());
        assertEquals(NAME_2, actual.get(1).getName());
        assertEquals(ID_2, actual.get(1).getId());
    }

    @Test
    void update_pokemon_base() {
        UpdatePokemonBasePayload updatePokemonBasePayload = new UpdatePokemonBasePayload(1, "Squirtle", PokemonType.WATER, null);
        when(mockPokemonBaseService.updatePokemonBase(anyInt(), any())).thenReturn(pokemonBase3);

        PokemonBase actual = pokemonBaseResource.updatePokemonBase(ID_1, updatePokemonBasePayload);

        assertEquals(ID_1, actual.getId());
        assertEquals(NAME_3, actual.getName());
    }

    @Test
    void create_pokemon_base() {
        assertNull(pokemonBaseResource.createPokemonBase());
    }

    @Test
    void delete_pokemon_base() {
        pokemonBaseResource.deletePokemonBaseById(ID_1);

        verify(mockPokemonBaseService).deletePokemonBaseById(ID_1);
    }
}
