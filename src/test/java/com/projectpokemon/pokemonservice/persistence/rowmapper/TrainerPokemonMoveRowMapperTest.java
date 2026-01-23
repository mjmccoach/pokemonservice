package com.projectpokemon.pokemonservice.persistence.rowmapper;

import com.projectpokemon.pokemonservice.objects.TrainerPokemonMove;
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
class TrainerPokemonMoveRowMapperTest {

    private static final String POKEMON_ID_COLUMN = "pokemon_id";
    private static final String MOVE_ID_COLUMN = "move_id";
    private static final String CURRENT_PP_COLUMN = "current_pp";
    private static final int POKEMON_ID_1 = 27;
    private static final int MOVE_ID_1 = 40;
    private static final int CURRENT_PP = 9;

    ResultSet mockResultSet;
    private TrainerPokemonMoveRowMapper trainerPokemonMoveRowMapper;

    @BeforeEach
    void setUp() throws SQLException {
        trainerPokemonMoveRowMapper = new TrainerPokemonMoveRowMapper();
        mockResultSet = Mockito.mock(ResultSet.class);
        when(mockResultSet.getInt(eq(POKEMON_ID_COLUMN))).thenReturn(POKEMON_ID_1);
        when(mockResultSet.getInt(eq(MOVE_ID_COLUMN))).thenReturn(MOVE_ID_1);
        when(mockResultSet.getInt(eq(CURRENT_PP_COLUMN))).thenReturn(CURRENT_PP);
    }

    @Test
    void map_row() throws SQLException {
        TrainerPokemonMove actual = trainerPokemonMoveRowMapper.mapRow(mockResultSet, 1);

        Assertions.assertNotNull(actual);
        assertEquals(POKEMON_ID_1, actual.getTrainerPokemonId());
        assertEquals(MOVE_ID_1, actual.getMoveBaseId());
        assertEquals(CURRENT_PP, actual.getCurrentPP());
    }

}