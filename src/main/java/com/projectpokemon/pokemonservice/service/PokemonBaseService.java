package com.projectpokemon.pokemonservice.service;

import com.projectpokemon.pokemonservice.objects.PokemonBase;
import com.projectpokemon.pokemonservice.objects.UpdatePokemonBasePayload;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class PokemonBaseService {

    public PokemonBaseService() {
    }

    public PokemonBase getPokemonBaseById() {
        return null;
    }

    public List<PokemonBase> getAllPokemonBases() {
        return Collections.emptyList();
    }

    public PokemonBase updatePokemonBase(int id, UpdatePokemonBasePayload updatePokemonBasePayload) {
        return null;
    }

    public PokemonBase createPokemonBase() {
        return null;
    }

    public void deletePokemonBase() {
    }
}
