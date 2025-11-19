package com.projectpokemon.pokemonservice.service;

import com.projectpokemon.pokemonservice.objects.TrainerPokemon;
import com.projectpokemon.pokemonservice.persistence.TrainersPokemonDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class TrainersPokemonService {

    private TrainersPokemonDAO trainersPokemonDAO;

    public List<TrainerPokemon> getTrainersPokemonById(int trainerId) {
        return trainersPokemonDAO.getTrainersPokemonById(trainerId);
    }

    public void updateTrainersPokemonById(String nickname, int level, int pokemonId, int trainerId) {
        trainersPokemonDAO.updateTrainersPokemonById(nickname, level, pokemonId, trainerId);
    }

    public void deleteTrainersPokemonById(int pokemonId, int trainerId) {
        trainersPokemonDAO.deleteTrainersPokemonById(pokemonId, trainerId);
    }
}
