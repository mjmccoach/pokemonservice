package com.projectpokemon.pokemonservice.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/trainers/pokemon/trainer")
public class TrainersPokemonResource {

    @GetMapping("/{trainerId}")
    public void getTrainersPokemon() {
    }

    @PutMapping("/{trainerId}/pokemon/{pokemonId}")
    public void updateTrainersPokemon() {
    }

    @DeleteMapping("/{trainerId}/pokemon/{pokemonId}")
    public void deleteTrainersPokemon() {
    }
}
