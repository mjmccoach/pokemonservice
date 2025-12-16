package com.projectpokemon.pokemonservice.persistence;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.objects.PokemonBase;
import com.projectpokemon.pokemonservice.persistence.rowmapper.PokemonBaseRowMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class PokemonBaseDAOTest {

    private static final String SELECT_BY_ID = "SELECT * from PokemonBase where id = ?";
    private static final String SELECT_ALL = "SELECT * from PokemonBase";
    private static final String UPDATE = "UPDATE `PokemonBase` " +
            "                             SET name = '%s' " +
            "                             primary_type = '%s' " +
            "                             secondary_type = '%s " +
            "                             WHERE id = %s;";
    private static final String DELETE = "DELETE from PokemonBase where id = ?";


    private static final int ID_1 = 1;
    private static final String NAME_1 = "Bulbasaur";
    private static final int ID_2 = 2;
    private static final String NAME_2 = "Ivysaur";

    private PokemonBase pokemonBase1;
    private PokemonBase pokemonBase2;

    @Mock
    private JdbcTemplate mockJdbcTemplate;
    @Mock
    private PokemonBaseRowMapper mockPokemonBaseRowMapper;
    @InjectMocks
    private PokemonBaseDAO pokemonBaseDAO;


    @BeforeEach
    void setUp() {
        pokemonBase1 = new PokemonBase(ID_1, NAME_1, PokemonType.GRASS, null);
        pokemonBase2 = new PokemonBase(ID_2, NAME_2, PokemonType.GRASS, null);
    }

    @Test
    void get_pokemon_base_by_id() {
        when(mockJdbcTemplate.queryForObject(eq(SELECT_BY_ID), eq(mockPokemonBaseRowMapper), eq(ID_1))).thenReturn(pokemonBase1);

        PokemonBase actual = pokemonBaseDAO.getPokemonBaseById(ID_1);

        verify(mockJdbcTemplate).queryForObject(SELECT_BY_ID, mockPokemonBaseRowMapper, ID_1);

        assertEquals(ID_1, actual.getId());
        assertEquals(NAME_1, actual.getName());
        assertEquals(PokemonType.GRASS, actual.getPrimaryType());
        assertNull(actual.getSecondaryType());
    }

    @Test
    void get_all_pokemon_bases() {
        when(mockJdbcTemplate.query(eq(SELECT_ALL), eq(mockPokemonBaseRowMapper))).thenReturn(Arrays.asList(pokemonBase1, pokemonBase2));

        List<PokemonBase> actual = pokemonBaseDAO.getAllPokemonBases();

        verify(mockJdbcTemplate).query(SELECT_ALL, mockPokemonBaseRowMapper);

        assertEquals(ID_1, actual.getFirst().getId());
        assertEquals(NAME_1, actual.getFirst().getName());
        assertEquals(PokemonType.GRASS, actual.getFirst().getPrimaryType());
        assertNull(actual.getFirst().getSecondaryType());

        assertEquals(ID_2, actual.get(1).getId());
        assertEquals(NAME_2, actual.get(1).getName());
        assertEquals(PokemonType.GRASS, actual.get(1).getPrimaryType());
        assertNull(actual.get(1).getSecondaryType());
    }

    @Test
    void update_pokemon_base() {
        pokemonBaseDAO.updatePokemonBase(NAME_1, PokemonType.GRASS, null, ID_1);

        verify(mockJdbcTemplate).update(eq(String.format(UPDATE, NAME_1, PokemonType.GRASS, null, ID_1)));
    }

    @Test
    void delete_pokemon_base() {
        pokemonBaseDAO.deletePokemonBaseById(ID_1);

        verify(mockJdbcTemplate).update(DELETE, ID_1);
    }
}