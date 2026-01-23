package com.projectpokemon.pokemonservice.persistence.rowmapper;

import com.projectpokemon.pokemonservice.objects.TrainerPokemon;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class TrainerPokemonRowMapperTest {
    private static final String ID_COLUMN = "id";
    private static final String TRAINER_COLUMN = "trainer_id";
    private static final String LEVEL_COLUMN = "level";
    private static final String NICKNAME_COLUMN = "nickname";

    private static final int TRAINER_ID = 20;
    private static final int POKEMON_1_ID = 2;
    private static final int LEVEL_30 = 30;
    private static final String NICKNAME = "Blastbug";

    ResultSet mockResultSet;
    private TrainerPokemonRowMapper trainerPokemonRowMapper;

    @BeforeEach
    void setUp() throws SQLException {
        trainerPokemonRowMapper = new TrainerPokemonRowMapper();
        mockResultSet = Mockito.mock(ResultSet.class);

        when(mockResultSet.getInt(ID_COLUMN)).thenReturn(POKEMON_1_ID);
        when(mockResultSet.getInt(TRAINER_COLUMN)).thenReturn(TRAINER_ID);
        when(mockResultSet.getInt(LEVEL_COLUMN)).thenReturn(LEVEL_30);
        when(mockResultSet.getString(NICKNAME_COLUMN)).thenReturn(NICKNAME);
    }

    @Test
    void map_row() throws SQLException {
        TrainerPokemon actual = trainerPokemonRowMapper.mapRow(mockResultSet, 1);

        Assertions.assertNotNull(actual);
        assertEquals(TRAINER_ID, actual.getTrainerId());
        assertEquals(POKEMON_1_ID, actual.getId());
        assertEquals(LEVEL_30, actual.getLevel());
        assertEquals(NICKNAME, actual.getNickname());
    }
}