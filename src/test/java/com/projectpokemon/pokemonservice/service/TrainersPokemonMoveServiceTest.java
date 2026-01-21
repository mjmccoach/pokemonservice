package com.projectpokemon.pokemonservice.service;

import com.projectpokemon.pokemonservice.objects.TrainerPokemonMove;
import com.projectpokemon.pokemonservice.persistence.TrainersPokemonMoveDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class TrainersPokemonMoveServiceTest {
    private static final int TRAINER_POKEMON_ID = 20;

    private static final int MOVE_ID = 13;
    private static final int MOVE_ID_2 = 19;
    private static final int CURRENT_PP_1 = 15;
    private static final int CURRENT_PP_2 = 12;

    @Mock
    TrainersPokemonMoveDAO mockTrainersPokemonMoveDAO;

    @InjectMocks
    TrainersPokemonMoveService trainersPokemonMoveService;

    private TrainerPokemonMove move1;
    private TrainerPokemonMove move2;

    @BeforeEach
    void setUp() {
        move1 = new TrainerPokemonMove(TRAINER_POKEMON_ID, MOVE_ID, null, CURRENT_PP_1);
        move2 = new TrainerPokemonMove(TRAINER_POKEMON_ID, MOVE_ID_2, null, CURRENT_PP_2);
    }

    @Test
    void create_trainer_pokemon_move() {
        trainersPokemonMoveService.createTrainerPokemonMove(TRAINER_POKEMON_ID, MOVE_ID, CURRENT_PP_1);

        verify(mockTrainersPokemonMoveDAO).createTrainerPokemonMove(TRAINER_POKEMON_ID, MOVE_ID, CURRENT_PP_1);
    }

    @Test
    void update_trainer_pokemon_move() {
        trainersPokemonMoveService.updateTrainerPokemonMovePp(CURRENT_PP_2, TRAINER_POKEMON_ID, MOVE_ID);

        verify(mockTrainersPokemonMoveDAO).updateTrainerPokemonMove(CURRENT_PP_2, TRAINER_POKEMON_ID, MOVE_ID);
    }

    @Test
    void delete_trainer_pokemon_move() {
        trainersPokemonMoveService.deleteTrainerPokemonMove(TRAINER_POKEMON_ID, MOVE_ID);

        verify(mockTrainersPokemonMoveDAO).deleteTrainerPokemonMove(TRAINER_POKEMON_ID, MOVE_ID);
    }

    @Test
    void select_all_trainer_pokemons_moves() {
        when(mockTrainersPokemonMoveDAO.getAllTrainerPokemonMoves(eq(TRAINER_POKEMON_ID))).thenReturn(Arrays.asList(move1, move2));

        List<TrainerPokemonMove> actual = trainersPokemonMoveService.getAllTrainersPokemonMoves(TRAINER_POKEMON_ID);

        assertEquals(2, actual.size());

        assertEquals(TRAINER_POKEMON_ID, actual.getFirst().getTrainerPokemonId());
        assertEquals(MOVE_ID, actual.getFirst().getMoveBaseId());
        assertEquals(CURRENT_PP_1, actual.getFirst().getCurrentPP());

        assertEquals(TRAINER_POKEMON_ID, actual.get(1).getTrainerPokemonId());
        assertEquals(MOVE_ID_2, actual.get(1).getMoveBaseId());
        assertEquals(CURRENT_PP_2, actual.get(1).getCurrentPP());
    }
}