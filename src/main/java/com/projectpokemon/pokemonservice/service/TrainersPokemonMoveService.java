package com.projectpokemon.pokemonservice.service;

import com.projectpokemon.pokemonservice.objects.TrainerPokemonMove;
import com.projectpokemon.pokemonservice.persistence.TrainersPokemonMoveDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class TrainersPokemonMoveService {
    TrainersPokemonMoveDAO trainersPokemonMoveDAO;

    public List<TrainerPokemonMove> getAllTrainersPokemonMoves(int trainerPokemonId) {
        return trainersPokemonMoveDAO.getAllTrainerPokemonMoves(trainerPokemonId);
    }

    public void deleteTrainerPokemonMove(int trainerPokemonId, int moveId) {
        trainersPokemonMoveDAO.deleteTrainerPokemonMove(trainerPokemonId, moveId);
    }

    public void updateTrainerPokemonMovePp(int newPp, int trainerPokemonId, int moveId) {
        trainersPokemonMoveDAO.updateTrainerPokemonMove(newPp, trainerPokemonId, moveId);
    }

    public void createTrainerPokemonMove(int trainerPokemonId, int moveId, int currentPp) {
        trainersPokemonMoveDAO.createTrainerPokemonMove(trainerPokemonId, moveId, currentPp);
    }
}
