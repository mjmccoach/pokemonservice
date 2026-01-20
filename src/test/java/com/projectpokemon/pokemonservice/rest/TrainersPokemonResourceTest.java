package com.projectpokemon.pokemonservice.rest;

import com.projectpokemon.pokemonservice.enums.PokemonType;
import com.projectpokemon.pokemonservice.objects.PokemonBase;
import com.projectpokemon.pokemonservice.objects.TrainerPokemon;
import com.projectpokemon.pokemonservice.service.TrainersPokemonService;
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
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class TrainersPokemonResourceTest {
    private static final int TRAINER_ID = 20;
    private static final int POKEMON_1_ID = 2;
    private static final int POKEMON_2_ID = 10;
    private static final int LEVEL_30 = 30;
    private static final int LEVEL_18 = 18;
    @Mock
    TrainersPokemonService mockTrainersPokemonService;
    @InjectMocks
    TrainersPokemonResource trainersPokemonResource;

    TrainerPokemon trainerPokemon1;
    TrainerPokemon trainerPokemon2;
    PokemonBase pokemonBase1;

    @BeforeEach
    void setUp() {
        trainerPokemon1 = new TrainerPokemon(POKEMON_1_ID, TRAINER_ID, LEVEL_18, null, null);
        trainerPokemon2 = new TrainerPokemon(POKEMON_2_ID, TRAINER_ID, LEVEL_30, null, null);
        pokemonBase1 = new PokemonBase(10, "Caterpie", PokemonType.BUG, null);
    }


    @Test
    void select_pokemon_by_trainer_id() {
        when(mockTrainersPokemonService.getTrainersPokemonById(anyInt())).thenReturn(Arrays.asList(trainerPokemon1, trainerPokemon2));

        List<TrainerPokemon> actual = trainersPokemonResource.getTrainersPokemon(TRAINER_ID);

        verify(mockTrainersPokemonService).getTrainersPokemonById(TRAINER_ID);

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
    void update_trainer_pokemon() {
        when(mockTrainersPokemonService.getTrainersPokemonById(anyInt())).thenReturn(Collections.singletonList(trainerPokemon2));

        trainersPokemonResource.updateTrainersPokemon(TRAINER_ID, POKEMON_2_ID, trainerPokemon2);

        verify(mockTrainersPokemonService).updateTrainersPokemonById(null, LEVEL_30, POKEMON_2_ID, TRAINER_ID);
        verify(mockTrainersPokemonService).setPokemonBases(Collections.singletonList(trainerPokemon2));
    }

    @Test
    void delete_trainer_pokemon() {
        trainersPokemonResource.deleteTrainersPokemon(TRAINER_ID, POKEMON_1_ID);

        verify(mockTrainersPokemonService).deleteTrainersPokemonById(POKEMON_1_ID, TRAINER_ID);
    }
}