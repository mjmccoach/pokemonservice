package com.projectpokemon.pokemonservice.persistence.rowmapper;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.objects.PokemonBase;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class PokemonBaseRowMapperTest {

    private static final int ID_1 = 1;
    private static final String NAME_1 = "Bulbasaur";
    private static final String SECONDARY_TYPE_COLUMN = "secondary_type";
    private static final String ID_COLUMN = "id";
    private static final String NAME_COLUMN = "name";
    private static final String PRIMARY_TYPE_COLUMN = "primary_type";

    PokemonBaseRowMapper pokemonBaseRowMapper;
    ResultSet mockResultSet;


    @BeforeEach
    void setUp() throws SQLException {
        mockResultSet = Mockito.mock(ResultSet.class);
        pokemonBaseRowMapper = new PokemonBaseRowMapper();
        when(mockResultSet.getInt(ID_COLUMN)).thenReturn(ID_1);
        when(mockResultSet.getString(NAME_COLUMN)).thenReturn(NAME_1);
        when(mockResultSet.getString(PRIMARY_TYPE_COLUMN)).thenReturn(PokemonType.GRASS.name());
    }

    @Test
    void map_row_no_secondary_type() throws SQLException {
        when(mockResultSet.getString(SECONDARY_TYPE_COLUMN)).thenReturn(null);

        PokemonBase actual = pokemonBaseRowMapper.mapRow(mockResultSet, 1);

        Assertions.assertNotNull(actual);
        assertEquals(ID_1, actual.getId());
        assertEquals(NAME_1, actual.getName());
        assertEquals(PokemonType.GRASS, actual.getPrimaryType());
        assertNull(actual.getSecondaryType());
    }

    @Test
    void map_row_secondary_type() throws SQLException {
        when(mockResultSet.getString(SECONDARY_TYPE_COLUMN)).thenReturn(PokemonType.POISON.name());

        PokemonBase actual = pokemonBaseRowMapper.mapRow(mockResultSet, 1);

        Assertions.assertNotNull(actual);
        assertEquals(ID_1, actual.getId());
        assertEquals(NAME_1, actual.getName());
        assertEquals(PokemonType.GRASS, actual.getPrimaryType());
        assertEquals(PokemonType.POISON, actual.getSecondaryType());
    }

}