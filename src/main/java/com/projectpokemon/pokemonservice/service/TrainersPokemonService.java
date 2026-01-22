package com.projectpokemon.pokemonservice.service;

import com.projectpokemon.pokemonservice.objects.TrainerPokemon;
import com.projectpokemon.pokemonservice.persistence.PokemonBaseDAO;
import com.projectpokemon.pokemonservice.persistence.TrainersPokemonDAO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@AllArgsConstructor
public class TrainersPokemonService {

    private TrainersPokemonDAO trainersPokemonDAO;
    private PokemonBaseDAO pokemonBaseDAO;
    private TrainersPokemonMoveService trainersPokemonMoveService;

    public List<TrainerPokemon> getTrainersPokemonById(int trainerId) {
        List<TrainerPokemon> trainerPokemonList = trainersPokemonDAO.getTrainersPokemonById(trainerId);
        setPokemonBases(trainerPokemonList);
        setPokemonMoves(trainerPokemonList);
        return trainerPokemonList;
    }

    public List<TrainerPokemon> updateTrainersPokemonById(String nickname, int level, int pokemonId, int trainerId) {
        trainersPokemonDAO.updateTrainersPokemonById(nickname, level, pokemonId, trainerId);
        return getTrainersPokemonById(trainerId);
    }

    public void deleteTrainersPokemonById(int pokemonId, int trainerId) {
        trainersPokemonDAO.deleteTrainersPokemonById(pokemonId, trainerId);
    }

    public void setPokemonBases(List<TrainerPokemon> trainerPokemonList) {
        trainerPokemonList.forEach(pokemon -> {
            pokemon.setPokemonBase(pokemonBaseDAO.getPokemonBaseById(pokemon.getId()));
        });
    }

    public void setPokemonMoves(List<TrainerPokemon> trainerPokemonList) {
        trainerPokemonList.forEach(pokemon -> {
            pokemon.setMoves(trainersPokemonMoveService.getAllTrainersPokemonMoves(pokemon.getId()));
        });
    }
}
