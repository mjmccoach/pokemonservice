package com.projectpokemon.pokemonservice.service;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.objects.PokemonBase;
import com.projectpokemon.pokemonservice.objects.TrainerPokemon;
import com.projectpokemon.pokemonservice.objects.TrainerPokemonMove;
import com.projectpokemon.pokemonservice.persistence.PokemonBaseDAO;
import com.projectpokemon.pokemonservice.persistence.TrainersPokemonDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class TrainersPokemonServiceTest {
    private static final int TRAINER_ID = 20;
    private static final int POKEMON_1_ID = 2;
    private static final int POKEMON_2_ID = 5;
    private static final int LEVEL_30 = 30;
    private static final int LEVEL_18 = 18;
    private static final String POKEMON_1_NAME = "Ivysaur";
    private static final String POKEMON_2_NAME = "Charmeleon";
    private static final int MOVE_ID = 37;
    private static final int CURRENT_PP = 35;

    @Mock
    TrainersPokemonDAO mockTrainersPokemonDAO;
    @Mock
    PokemonBaseDAO mockPokemonBaseDao;
    @Mock
    TrainersPokemonMoveService mockTrainersPokemonMoveService;

    @InjectMocks
    private TrainersPokemonService trainersPokemonService;

    private TrainerPokemon trainerPokemon1;
    private TrainerPokemon trainerPokemon2;
    private PokemonBase pokemonBase1;
    private PokemonBase pokemonBase2;
    private TrainerPokemonMove trainerPokemonMove;

    @BeforeEach
    void setUp() {
        trainerPokemon1 = new TrainerPokemon(POKEMON_1_ID, TRAINER_ID, LEVEL_18, null, null, Collections.emptyList());
        trainerPokemon2 = new TrainerPokemon(POKEMON_2_ID, TRAINER_ID, LEVEL_30, null, null, Collections.emptyList());
        pokemonBase1 = new PokemonBase(POKEMON_1_ID, POKEMON_1_NAME, PokemonType.GRASS, null);
        pokemonBase2 = new PokemonBase(POKEMON_1_ID, POKEMON_2_NAME, PokemonType.FIRE, null);
        trainerPokemonMove = new TrainerPokemonMove(POKEMON_1_ID, MOVE_ID, null, CURRENT_PP);
    }

    @Test
    void select_pokemon_by_trainer_id() {
        when(mockTrainersPokemonDAO.getTrainersPokemonById(anyInt())).thenReturn(Arrays.asList(trainerPokemon1, trainerPokemon2));
        when(mockPokemonBaseDao.getPokemonBaseById(eq(POKEMON_1_ID))).thenReturn(pokemonBase1);
        when(mockPokemonBaseDao.getPokemonBaseById(eq(POKEMON_2_ID))).thenReturn(pokemonBase2);
        when(mockTrainersPokemonMoveService.getAllTrainersPokemonMoves(eq(POKEMON_1_ID))).thenReturn(Collections.singletonList(trainerPokemonMove));

        List<TrainerPokemon> actual = trainersPokemonService.getTrainersPokemonById(TRAINER_ID);

        verify(mockTrainersPokemonDAO).getTrainersPokemonById(TRAINER_ID);

        assertEquals(2, actual.size());

        assertEquals(POKEMON_1_ID, actual.getFirst().getId());
        assertEquals(TRAINER_ID, actual.getFirst().getTrainerId());
        assertEquals(LEVEL_18, actual.getFirst().getLevel());
        assertNull(actual.getFirst().getNickname());
        assertEquals(POKEMON_1_NAME, actual.getFirst().getPokemonBase().getName());

        assertEquals(1, actual.getFirst().getMoves().size());
        assertEquals(MOVE_ID, actual.getFirst().getMoves().getFirst().getMoveBaseId());
        assertEquals(CURRENT_PP, actual.getFirst().getMoves().getFirst().getCurrentPP());


        assertEquals(5, actual.get(1).getId());
        assertEquals(20, actual.get(1).getTrainerId());
        assertEquals(30, actual.get(1).getLevel());
        assertNull(actual.get(1).getNickname());
        assertEquals(POKEMON_2_NAME, actual.get(1).getPokemonBase().getName());
    }

    @Test
    void update_trainer_pokemon() {
        when(mockTrainersPokemonDAO.getTrainersPokemonById(eq(TRAINER_ID))).thenReturn(Collections.singletonList(trainerPokemon1));
        when(mockPokemonBaseDao.getPokemonBaseById(eq(POKEMON_1_ID))).thenReturn(pokemonBase1);

        List<TrainerPokemon> actual = trainersPokemonService.updateTrainersPokemonById(null, LEVEL_18, POKEMON_1_ID, TRAINER_ID);

        verify(mockTrainersPokemonDAO).updateTrainersPokemonById(null, LEVEL_18, POKEMON_1_ID, TRAINER_ID);
        assertEquals(POKEMON_1_ID, actual.getFirst().getId());
        assertEquals(TRAINER_ID, actual.getFirst().getTrainerId());
        assertEquals(LEVEL_18, actual.getFirst().getLevel());
        assertEquals(POKEMON_1_NAME, actual.getFirst().getPokemonBase().getName());
    }

    @Test
    void delete_trainer_pokemon() {
        trainersPokemonService.deleteTrainersPokemonById(POKEMON_2_ID, TRAINER_ID);

        verify(mockTrainersPokemonDAO).deleteTrainersPokemonById(POKEMON_2_ID, TRAINER_ID);
    }
}