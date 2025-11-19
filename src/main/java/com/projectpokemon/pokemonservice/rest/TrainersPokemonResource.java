package com.projectpokemon.pokemonservice.rest;

import com.projectpokemon.pokemonservice.objects.TrainerPokemon;
import com.projectpokemon.pokemonservice.service.TrainersPokemonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/trainers/pokemon/trainer")
@AllArgsConstructor
public class TrainersPokemonResource {

    private TrainersPokemonService trainersPokemonService;

    @GetMapping("/{trainerId}")
    public List<TrainerPokemon> getTrainersPokemon(@PathVariable("trainerId") int trainerId) {
        return trainersPokemonService.getTrainersPokemonById(trainerId);
    }

    @PutMapping("/{trainerId}/pokemon/{pokemonId}")
    public void updateTrainersPokemon(@PathVariable("trainerId") int trainerId, @PathVariable("pokemonId") int pokemonId, @RequestBody TrainerPokemon trainerPokemon) {
        trainersPokemonService.updateTrainersPokemonById(trainerPokemon.getNickname(), trainerPokemon.getLevel(), pokemonId, trainerId);
    }

    @DeleteMapping("/{trainerId}/pokemon/{pokemonId}")
    public void deleteTrainersPokemon(@PathVariable("trainerId") int trainerId, @PathVariable("pokemonId") int pokemonId) {
        trainersPokemonService.deleteTrainersPokemonById(pokemonId, trainerId);
    }
}
