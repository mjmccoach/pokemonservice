package com.projectpokemon.pokemonservice.rest;

import com.projectpokemon.pokemonservice.objects.PokemonBase;
import com.projectpokemon.pokemonservice.objects.UpdatePokemonBasePayload;
import com.projectpokemon.pokemonservice.service.PokemonBaseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/pokemon/base")
public class PokemonBaseResource {

    private PokemonBaseService pokemonBaseService;

    public PokemonBaseResource(PokemonBaseService pokemonBaseService) {
        this.pokemonBaseService = pokemonBaseService;
    }

    @GetMapping("/{id}")
    public PokemonBase getPokemonBaseById(@PathVariable("id") int id) {
        return pokemonBaseService.getPokemonBaseById(id);
    }

    @GetMapping("/all")
    public List<PokemonBase> getAllPokemonBases() {
        return pokemonBaseService.getAllPokemonBases();
    }

    @PutMapping("/{id}")
    public PokemonBase updatePokemonBase(@PathVariable("id") int id, UpdatePokemonBasePayload updatePokemonBasePayload) {
        return pokemonBaseService.updatePokemonBase(id, updatePokemonBasePayload);
    }

    @PostMapping
    public PokemonBase createPokemonBase() {
        return pokemonBaseService.createPokemonBase();
    }

    @DeleteMapping("/{id}")
    public void deletePokemonBaseById(@PathVariable("id") int id) {
        pokemonBaseService.deletePokemonBaseById(id);
    }
}
