package com.projectpokemon.pokemonservice.service;

import com.projectpokemon.pokemonservice.objects.TrainerPokemon;
import com.projectpokemon.pokemonservice.persistence.PokemonBaseDAO;
import com.projectpokemon.pokemonservice.persistence.TrainersPokemonDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class TrainersPokemonService {

    private TrainersPokemonDAO trainersPokemonDAO;
    private PokemonBaseDAO pokemonBaseDAO;

    public List<TrainerPokemon> getTrainersPokemonById(int trainerId) {
        List<TrainerPokemon> trainerPokemonList = trainersPokemonDAO.getTrainersPokemonById(trainerId);
        setPokemonBases(trainerPokemonList);
        return trainerPokemonList;
    }

    public List<TrainerPokemon> updateTrainersPokemonById(String nickname, int level, int pokemonId, int trainerId) {
        trainersPokemonDAO.updateTrainersPokemonById(nickname, level, pokemonId, trainerId);
        return getTrainersPokemonById(trainerId);
    }

    public void deleteTrainersPokemonById(int pokemonId, int trainerId) {
        trainersPokemonDAO.deleteTrainersPokemonById(pokemonId, trainerId);
    }

    private void setPokemonBases(List<TrainerPokemon> trainerPokemonList) {
        trainerPokemonList.forEach(pokemon -> {
            pokemon.setPokemonBase(pokemonBaseDAO.getPokemonBaseById(pokemon.getId()));
        });
    }
}
