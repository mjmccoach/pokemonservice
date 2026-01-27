package com.projectpokemon.pokemonservice.service;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.objects.PokemonBase;
import com.projectpokemon.pokemonservice.objects.UpdatePokemonBasePayload;
import com.projectpokemon.pokemonservice.persistence.PokemonBaseDAO;
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
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class PokemonBaseServiceTest {
    private static final int ID_1 = 1;
    private static final String NAME_1 = "Bulbasaur";
    private static final int ID_2 = 2;
    private static final String NAME_2 = "Ivysaur";
    private static final String NAME_3 = "Squirtle";

    private PokemonBaseService pokemonBaseService;
    private PokemonBase pokemonBase1;
    private PokemonBase pokemonBase2;

    @Mock
    private PokemonBaseDAO mockPokemonBaseDao;

    @BeforeEach
    void setUp() {
        pokemonBaseService = new PokemonBaseService(mockPokemonBaseDao);
        pokemonBase1 = new PokemonBase(ID_1, NAME_1, PokemonType.GRASS, null);
        pokemonBase2 = new PokemonBase(ID_2, NAME_2, PokemonType.GRASS, null);
    }

    @Test
    void get_pokemon_base_by_id() {
        when(mockPokemonBaseDao.getPokemonBaseById(anyInt())).thenReturn(pokemonBase1);

        PokemonBase actual = pokemonBaseService.getPokemonBaseById(ID_1);

        verify(mockPokemonBaseDao).getPokemonBaseById(ID_1);

        assertEquals(ID_1, actual.getId());
        assertEquals(NAME_1, actual.getName());
    }

    @Test
    void get_all_pokemon_bases() {
        when(mockPokemonBaseDao.getAllPokemonBases()).thenReturn(Arrays.asList(pokemonBase1, pokemonBase2));

        List<PokemonBase> actual = pokemonBaseService.getAllPokemonBases();

        verify(mockPokemonBaseDao).getAllPokemonBases();

        assertEquals(ID_1, actual.getFirst().getId());
        assertEquals(NAME_1, actual.getFirst().getName());
        assertEquals(ID_2, actual.get(1).getId());
        assertEquals(NAME_2, actual.get(1).getName());
    }

    @Test
    void update_pokemon_base() {
        UpdatePokemonBasePayload updatePokemonBasePayload = new UpdatePokemonBasePayload(ID_1, NAME_3, PokemonType.WATER, null);

        pokemonBase1.setName(NAME_3);
        pokemonBase1.setPrimaryType(PokemonType.WATER);
        when(mockPokemonBaseDao.getPokemonBaseById(anyInt())).thenReturn(pokemonBase1);

        PokemonBase actual = pokemonBaseService.updatePokemonBase(ID_1, updatePokemonBasePayload);

        verify(mockPokemonBaseDao).updatePokemonBase(NAME_3,
                updatePokemonBasePayload.getPrimaryType(),
                updatePokemonBasePayload.getSecondaryType(),
                updatePokemonBasePayload.getId());

        assertEquals(NAME_3, actual.getName());
        assertEquals(PokemonType.WATER, actual.getPrimaryType());
        assertNull(actual.getSecondaryType());
    }

    @Test
    void create_pokemon_base() {
        assertNull(pokemonBaseService.createPokemonBase());
    }

    @Test
    void delete_pokemon_base() {
        pokemonBaseService.deletePokemonBaseById(ID_1);

        verify(mockPokemonBaseDao).deletePokemonBaseById(ID_1);
    }
}