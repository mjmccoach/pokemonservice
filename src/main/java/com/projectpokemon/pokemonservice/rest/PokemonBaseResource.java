package com.projectpokemon.pokemonservice.rest;

import com.projectpokemon.pokemonservice.objects.PokemonBase;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController("/pokemon/base")
public class PokemonBaseResource {

    @GetMapping("/{id}")
    public PokemonBase getPokemonBaseById() {
        return null;
    }

    @GetMapping("/all")
    public List<PokemonBase> getAllPokemonBases() {
        return Collections.emptyList();
    }

    @PutMapping("/{id}")
    public PokemonBase updatePokemonBase() {
        return null;
    }

    @PostMapping
    public PokemonBase createPokemonBase() {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePokemonBaseById() {

    }
}
