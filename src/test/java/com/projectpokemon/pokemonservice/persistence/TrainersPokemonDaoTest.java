package com.projectpokemon.pokemonservice.persistence;

import com.projectpokemon.pokemonservice.objects.TrainerPokemon;
import com.projectpokemon.pokemonservice.persistence.rowmapper.TrainerPokemonRowMapper;
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
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class TrainersPokemonDaoTest {

    private static final String SELECT_BY_ID = "SELECT * from TrainersPokemon WHERE trainerId = ?";
    private static final String UPDATE_BY_ID = "UPDATE TrainersPokemon" +
            "                                   SET nickname = '%s' " +
            "                                   SET level = '%s' " +
            "                                   WHERE id = %s AND trainer_id = %s";
    private static final String DELETE_BY_ID = "DELETE from TrainersPokemon WHERE id = ? AND trainer_id = ?";

    private static final int TRAINER_ID = 20;
    private static final int POKEMON_1_ID = 2;
    private static final int POKEMON_2_ID = 10;
    private static final int LEVEL_30 = 30;
    private static final int LEVEL_18 = 18;

    @Mock
    JdbcTemplate mockJdbcTemplate;
    @Mock
    TrainerPokemonRowMapper mockTrainerPokemonRowMapper;
    @InjectMocks
    private TrainersPokemonDAO trainersPokemonDAO;
    private TrainerPokemon trainerPokemon1;
    private TrainerPokemon trainerPokemon2;


    @BeforeEach
    void setUp() {
        trainerPokemon1 = new TrainerPokemon(POKEMON_1_ID, TRAINER_ID, LEVEL_18, null, null, Collections.emptyList());
        trainerPokemon2 = new TrainerPokemon(POKEMON_2_ID, TRAINER_ID, LEVEL_30, null, null, Collections.emptyList());
    }

    @Test
    void select_by_trainer_id() {

        when(mockJdbcTemplate.query(eq(SELECT_BY_ID), eq(mockTrainerPokemonRowMapper), eq(TRAINER_ID))).thenReturn(Arrays.asList(trainerPokemon1, trainerPokemon2));

        List<TrainerPokemon> actual = trainersPokemonDAO.getTrainersPokemonById(20);

        verify(mockJdbcTemplate).query(SELECT_BY_ID, mockTrainerPokemonRowMapper, TRAINER_ID);

        assertEquals(2, actual.size());

        assertEquals(2, actual.getFirst().getId());
        assertEquals(20, actual.getFirst().getTrainerId());
        assertEquals(18, actual.getFirst().getLevel());
        assertNull(actual.getFirst().getNickname());
        assertNull(actual.getFirst().getPokemonBase());

        assertEquals(10, actual.get(1).getId());
        assertEquals(20, actual.get(1).getTrainerId());
        assertEquals(30, actual.get(1).getLevel());
        assertNull(actual.get(1).getNickname());
        assertNull(actual.get(1).getPokemonBase());
    }

    @Test
    void update_by_id() {
        trainersPokemonDAO.updateTrainersPokemonById("Fiery boi", 36, POKEMON_1_ID, TRAINER_ID);

        verify(mockJdbcTemplate).update(eq(String.format(UPDATE_BY_ID, "Fiery boi", 36, POKEMON_1_ID, TRAINER_ID)));
    }

    @Test
    void delete_by_id() {
        trainersPokemonDAO.deleteTrainersPokemonById(TRAINER_ID, POKEMON_1_ID);

        verify(mockJdbcTemplate).update(DELETE_BY_ID, TRAINER_ID, POKEMON_1_ID);
    }
}
