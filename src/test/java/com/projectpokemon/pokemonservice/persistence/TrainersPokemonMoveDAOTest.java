package com.projectpokemon.pokemonservice.persistence;

import com.projectpokemon.pokemonservice.objects.TrainerPokemonMove;
import com.projectpokemon.pokemonservice.persistence.rowmapper.TrainerPokemonMoveRowMapper;
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
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class TrainersPokemonMoveDAOTest {
    private static final String INSERT = "INSERT into trainer_pokemon_moves VALUES (%s, %s, %s)";
    private static final String DELETE = "DELETE from trainer_pokemon_moves WHERE trainer_pokemon_id = %s AND move_id = %s";
    private static final String UPDATE = "UPDATE trainer_pokemon_moves SET current_pp = %s WHERE trainer_pokemon_id = ? and move_id =?";
    private static final String SELECT_ALL = "SELECT * from trainer_pokemon_moves WHERE trainer_pokemon_id = ?";

    private static final int TRAINER_POKEMON_ID = 20;

    private static final int MOVE_ID = 13;
    private static final int MOVE_ID_2 = 19;
    private static final int CURRENT_PP_1 = 15;
    private static final int CURRENT_PP_2 = 12;
    @Mock
    JdbcTemplate mockJdbcTemplate;
    @Mock
    TrainerPokemonMoveRowMapper mockTrainerPokemonMoveRowMapper;
    @InjectMocks
    TrainersPokemonMoveDAO trainersPokemonDAO;
    private TrainerPokemonMove move1;
    private TrainerPokemonMove move2;

    @BeforeEach
    void setUp() {
        move1 = new TrainerPokemonMove(TRAINER_POKEMON_ID, MOVE_ID, null, CURRENT_PP_1);
        move2 = new TrainerPokemonMove(TRAINER_POKEMON_ID, MOVE_ID_2, null, CURRENT_PP_2);
    }

    @Test
    void create() {
        trainersPokemonDAO.createTrainerPokemonMove(TRAINER_POKEMON_ID, MOVE_ID, CURRENT_PP_1);

        verify(mockJdbcTemplate).execute(String.format(INSERT, TRAINER_POKEMON_ID, MOVE_ID, CURRENT_PP_1));
    }

    @Test
    void delete() {
        trainersPokemonDAO.deleteTrainerPokemonMove(TRAINER_POKEMON_ID, MOVE_ID);

        verify(mockJdbcTemplate).update(DELETE, TRAINER_POKEMON_ID, MOVE_ID);
    }

    @Test
    void update() {
        trainersPokemonDAO.updateTrainerPokemonMove(CURRENT_PP_2, TRAINER_POKEMON_ID, MOVE_ID);

        verify(mockJdbcTemplate).update(UPDATE, CURRENT_PP_2, TRAINER_POKEMON_ID, MOVE_ID);
    }

    @Test
    void select_all() {
        when(mockJdbcTemplate.query(eq(SELECT_ALL), eq(mockTrainerPokemonMoveRowMapper), eq(TRAINER_POKEMON_ID))).thenReturn(Arrays.asList(move1, move2));

        List<TrainerPokemonMove> actual = trainersPokemonDAO.getAllTrainerPokemonMoves(TRAINER_POKEMON_ID);

        assertEquals(2, actual.size());

        assertEquals(TRAINER_POKEMON_ID, actual.getFirst().getTrainerPokemonId());
        assertEquals(MOVE_ID, actual.getFirst().getMoveBaseId());
        assertEquals(CURRENT_PP_1, actual.getFirst().getCurrentPP());

        assertEquals(TRAINER_POKEMON_ID, actual.get(1).getTrainerPokemonId());
        assertEquals(MOVE_ID_2, actual.get(1).getMoveBaseId());
        assertEquals(CURRENT_PP_2, actual.get(1).getCurrentPP());
    }
}