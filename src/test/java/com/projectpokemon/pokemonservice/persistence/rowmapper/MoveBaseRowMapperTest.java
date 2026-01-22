package com.projectpokemon.pokemonservice.persistence.rowmapper;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.objects.MoveBase;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class MoveBaseRowMapperTest {
    private static final int MOVE_BASE_ID1 = 30;
    private static final String MOVE_BASE_NAME1 = "Flamethrower";
    private static final int PP1 = 15;
    private static final int MOVE_BASE_ID2 = 45;
    private static final String MOVE_BASE_NAME2 = "Thunderbolt";
    private static final int PP2 = 15;
    private static final int MOVE_BASE_ID3 = 50;
    private static final String MOVE_BASE_NAME3 = "Thunder";
    private static final int PP3 = 5;

    MoveBaseRowMapper moveBaseRowMapper;

    ResultSet mockResultSet;

    @BeforeEach
    void setUp() throws SQLException {
        moveBaseRowMapper = new MoveBaseRowMapper();
        mockResultSet = Mockito.mock(ResultSet.class);
        when(mockResultSet.getInt(eq("id"))).thenReturn(MOVE_BASE_ID1);
        when(mockResultSet.getString(eq("name"))).thenReturn(MOVE_BASE_NAME1);
        when(mockResultSet.getString("type")).thenReturn(PokemonType.FIRE.name());
        when(mockResultSet.getInt(eq("maxpp"))).thenReturn(PP1);
    }

    @Test
    void map_row() throws SQLException {
        MoveBase actual = moveBaseRowMapper.mapRow(mockResultSet, 1);
        Assertions.assertNotNull(actual);
        assertEquals(MOVE_BASE_ID1, actual.getId());
        assertEquals(MOVE_BASE_NAME1, actual.getName());
        assertEquals(PokemonType.FIRE, actual.getPokemonType());
        assertEquals(PP1, actual.getMaxpp());
    }
}